### DESCRIPTION

Demo project for exposing bug in Play Framework 1.3.x.

Second and further content readings (getString() or getXml()) from HttpResponse results in empty string. This is true only for POST requests.

Example:
```
HttpResponse response = WS.url( "http://google.com" ).post();
String resp1 = response.getString(); // resp1 hold some HTML
String resp2 = response.getString(); // resp2 is empty
```

Affected framework versions: 1.3.x (all revisions after [playframework/play1@2a96ea7](https://github.com/playframework/play1/commit/2a96ea7c8e61e98fbfe239e94ea303aaab2b6a73#diff-d41d8cd98f00b204e9800998ecf8427e) inclusive).

Tested on these JREs:
* 1.7.0.67/1.8.0.11.

Tested on these OSes:
* Ubuntu 12.04 x86_64 (baremetal).

