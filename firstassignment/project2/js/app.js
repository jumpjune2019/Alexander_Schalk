$.ready(function() {
	$.get('title').innerHTML = $.string.format("Quiz Game {0}", $.getVersion());
	// above line comment removed
});