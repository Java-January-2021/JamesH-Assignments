$(document).ready(function(){
	$("#water_slide").hide();
	$("#animals_slide").hide();
	$("#soil_slide").hide();
});

$("#forest").click(function() {
    $("#forest_slide").slideToggle( "slow" );
});

$("#water").click(function() {
    $("#water_slide").slideToggle( "slow" );
});

$("#animals").click(function() {
    $("#animals_slide").slideToggle( "slow" );
});

$("#soil").click(function() {
    $("#soil_slide").slideToggle( "slow" );
});