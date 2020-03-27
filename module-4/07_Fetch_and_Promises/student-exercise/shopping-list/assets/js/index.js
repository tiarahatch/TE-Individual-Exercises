let shoppingList = [];

const loadingButton = document.querySelector(".loadingButton");
loadingButton.addEventListener("click",()=>{
    loadShoppingList();
    loadingButton.disabled = "true";
});

function loadShoppingList(){
    fetch('assets/data/shopping-list.json')
        .then((response)=>{
        return response.json();
    })
    .then((data)=>{
        shoppingList = data;
        displayShoppingList();
    })
    .catch(err =>{
        console.log(err);
    })
}

function displayShoppingList(){  
    if('content'in document.createElement('template')){
            const ul = document.querySelector('ul');
            shoppingList.forEach((item)=>{
            const tmpl = document.getElementById('shopping-list-item-template').content.cloneNode(true);
            tmpl.querySelector("li").insertAdjacentHTML('afterbegin',item.name);
        
        if( item.completed ) {
            const circleCheck = tmpl.querySelector('.fa-check-circle');
            const currentClass = circleCheck.className;
            circleCheck.className = currentClass + " completed";
        }
        ul.appendChild(tmpl);
        });
    }
}