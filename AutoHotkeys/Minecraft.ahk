#NoEnv  ; Recommended for performance and compatibility with future AutoHotkey releases.
; #Warn  ; Enable warnings to assist with detecting common errors.
SendMode Input  ; Recommended for new scripts due to its superior speed and reliability.
SetWorkingDir %A_ScriptDir%  ; Ensures a consistent starting directory.


; Minecraft AutoHotkeys
;
;
;
; Hold left Mouse Button Down
F1::
ToggleLeft = !ToggleLeft
If ToggleLeft
	Click, Down
else
	Click, Up
return

; Hold right Mouse Button down
F2::
ToggleRight = !ToggleRight
If ToggleRight
	Click, Down, Right
else
	Click, Up, Right
return