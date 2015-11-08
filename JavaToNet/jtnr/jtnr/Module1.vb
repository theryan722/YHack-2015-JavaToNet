Module Module1
    Private args() As String = Environment.GetCommandLineArgs
    Sub Main()
        For i As Integer = 0 To args.Count - 1
            PrintLine(args(i))
        Next
    End Sub

End Module
