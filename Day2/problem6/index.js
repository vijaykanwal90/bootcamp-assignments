var array = [1, 2, 3, 3, 4, 5, 6, 7]
var form = document.getElementById('form')

function displayData() {
    var displayBox = document.getElementById('array-data')
    displayBox.innerHTML = ''


    array.forEach(item => {
        var listItem = document.createElement('li')
        listItem.style.listStyle = 'none'
        listItem.textContent = item;
        displayBox.appendChild(listItem)

    })
}
form.addEventListener('submit', function (event) {
    event.preventDefault()
    var old = document.getElementById('old').value
    var newitem = document.getElementById('newitem').value

    array = array.map(item => item === old ? newitem : item)
    displayData()
    form.reset()

})
window.onload = displayData
