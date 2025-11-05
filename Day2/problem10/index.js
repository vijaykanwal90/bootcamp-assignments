
var addbutton = document.getElementById('add')
var tablebody = document.getElementById('table-body')
addbutton.addEventListener('click', function (event) {
    event.preventDefault();

    var name = prompt("Enter student name");
    if (!name || name.trim() === '') {
        alert('name cannot be empty')
        return;
    }
    var subjects = ['Subject1', 'Subject2', 'Subject3', 'Subject4', 'Subject5'];
    var marks = [];


    for (var j = 0; j < subjects.length; j++) {
        var mark = prompt("Enter " + subjects[j] + " marks");
        mark = parseFloat(mark);
        if (isNaN(mark) || (mark < 0 || mark > 100)) {
            alert('marks should be between 0 and 100')
            return;
        }
        marks.push(mark);

    }
    var totalmarks = marks.reduce((acc, sum) => {
        return acc + sum;
    }, 0)
    var average = totalmarks / subjects.length;

    var newStudent = {
        name: name,
        marks: marks,
        total: totalmarks,
        average: average
    };


    var storedData = localStorage.getItem("studentsData");
    var studentsArray = storedData ? JSON.parse(storedData) : [];


    studentsArray.push(newStudent);


    localStorage.setItem("studentsData", JSON.stringify(studentsArray));

    alert("Student added successfully!");
    displayStudentData()
});

function displayStudentData() {
    var studentsData = localStorage.getItem('studentsData')
    if (!studentsData) {
        console.log("No students data found")
        return;
    }
    studentsData = JSON.parse(studentsData)
    var totalStudents = studentsData.length;
    tablebody.innerHTML = ''

    studentsData.forEach(student => {
        var row = document.createElement('tr');

        Object.keys(student).forEach(item => {
            if (item === 'marks' && Array.isArray(student[item])) {

                student[item].forEach(mark => {
                    var markCell = document.createElement('td');
                    markCell.textContent = mark;
                    row.appendChild(markCell);
                });
            } else {

                var cell = document.createElement('td');
                cell.textContent = student[item];
                row.appendChild(cell);
            }
        });

        tablebody.appendChild(row);
    });




}

// displayStudentData()

window.onload = displayStudentData;
