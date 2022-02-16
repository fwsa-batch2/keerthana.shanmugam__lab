let List = [];

function submitHandler() {
    event.preventDefault();
    const taskValue = document.getElementById("todoTask").value;

    //push the value inside the array
    List.push(taskValue);
    console.log(List);

    const store = List.length;
    console.log(store);

    let main = "";
    for (i = 0; i < store; i++) {
        let Value = "<li>" + List[i] + "</li>";

        main = main + Value;
    }
    const ultag = document.getElementById('todoList');
    ultag.innerHTML = main;

}
