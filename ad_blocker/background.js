const defaultFilters = [
    "*://*.youtube.com/*",
    "*://*.google.com/*",
	"*://*.doubleclick.net/*",
	"*://partner.googleadservices.com/*",
	"*://*.googlesyndication.com/*",
	"*://*.google-analytics.com/*",
    "*://*.zedo.com/*",
    "*://*.egov.ddit.ac.in/*"
 
    
]

chrome.webRequest.onBeforeRequest.addListener(
    function(details) { return { cancel: true}},
    { urls: defaultFilters },
    ["blocking"]
)