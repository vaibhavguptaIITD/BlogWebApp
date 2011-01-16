 <script>
    var source = new EventSource('/projects/serverEvent');
    source.onmessage = function (e) {
      document.body.innerHTML += e.data + '<br>';
    };
  </script>
