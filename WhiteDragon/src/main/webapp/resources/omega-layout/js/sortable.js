$( function() {
    $( "ul.droptrue" ).sortable({
      connectWith: "ul",
      cursor: "move",
      opacity: 0.5,
      classes: {
    	    "ui-sortable": "highlight"
    	  }
    
    	  
    });
 
    $( "#sortable1, #sortable2, #sortable3" ).disableSelection();
  } );

