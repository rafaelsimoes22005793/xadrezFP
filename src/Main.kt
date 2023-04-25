fun buildMenu(): String = "1-> Start New Game;\n" + "2-> Exit Game.\n"

fun checkName(number: String): Boolean {
    var count = 0
    if (number[0].toInt() in 65..90) {
        while (count <= number.length - 1) {
            count++
            when {
                count > number.length - 1 -> return false
                number[count] == ' ' -> {
                    if (number[count + 1] != ' ' && number[count + 1].toInt() in 65..90) {
                        return true
                    }
                    return false
                }
            }
        }
        return true
    } else {
        return false
    }
}

fun checkIsNumber(number: String): Boolean {
    return when {
        number in "0".."9" -> true
        else -> false
    }
}

fun showChessLegendOrPieces(message: String): Boolean? {
    return when {
        message == "" -> null
        message[0].toInt() == 89 || message[0].toInt() == 121 -> true
        message[0].toInt() == 78 || message[0].toInt() == 110 -> false
        else -> null
    }
}

val QueenW : Pair<String,String> = Pair("Q","w") ; val QueenB : Pair<String,String> = Pair("Q","b")
val PeaoW : Pair<String,String> = Pair("P","w") ; val PeaoB : Pair<String,String> = Pair("P","b")
val HorseW : Pair<String,String> = Pair("H","w") ; val HorseB : Pair<String,String> = Pair("H","b")
val KingW : Pair<String,String> = Pair("K","w") ; val KingB : Pair<String,String> = Pair("K","b")
val TorreW : Pair<String,String> = Pair("T","w") ; val TorreB : Pair<String,String> = Pair("T","b")
val BispoW : Pair<String,String> = Pair("B","w") ; val BispoB : Pair<String,String> = Pair("B","b")


fun convertStringToUnicode(piece: String, color: String): String{
    when{
        piece == "P" && color == "w" -> return "\u2659" ;  piece == "P" && color == "b" -> return "\u265F"
        piece == "H" && color == "w" -> return "\u2658" ;  piece == "H" && color == "b" -> return "\u265E"
        piece == "K" && color == "w" -> return "\u2654" ;  piece == "K" && color == "b" -> return "\u265A"
        piece == "T" && color == "w" -> return "\u2656" ;  piece == "T" && color == "b" -> return "\u265C"
        piece == "B" && color == "w" -> return "\u2657" ;  piece == "B" && color == "b" -> return "\u265D"
        piece == "Q" && color == "w" -> return "\u2655" ;  piece == "Q" && color == "b" -> return "\u265B"
        else -> return " "
    }
}

fun board8x8(): Array<Pair<String,String>?>{
    val tabuleiro : Array<Pair<String,String>?> = arrayOfNulls(64)
    tabuleiro[0] = TorreB ; tabuleiro[1] = HorseB ; tabuleiro[2] = BispoB ; tabuleiro[3] = QueenB
    tabuleiro[4] = KingB ; tabuleiro[5] = BispoB ; tabuleiro[6] = HorseB ; tabuleiro [7] = TorreB
    tabuleiro[8] = PeaoB ; tabuleiro[9] = PeaoB ; tabuleiro[10] = PeaoB ; tabuleiro[11] = PeaoB
    tabuleiro[12] = PeaoB ; tabuleiro[13] = PeaoB ; tabuleiro[14] = PeaoB ; tabuleiro[15] = PeaoB
    tabuleiro[63] = TorreW ; tabuleiro[62] = HorseW; tabuleiro[61] = BispoW ; tabuleiro[60] = QueenW
    tabuleiro[59] = KingW ; tabuleiro[58] = BispoW ; tabuleiro[57] = HorseW ; tabuleiro [56] = TorreW
    tabuleiro[55] = PeaoW ; tabuleiro[54] = PeaoW ; tabuleiro[53] = PeaoW ; tabuleiro[52] = PeaoW
    tabuleiro[51] = PeaoW ; tabuleiro[50] = PeaoW ; tabuleiro[49] = PeaoW ; tabuleiro[48] = PeaoW
    return tabuleiro
}

fun board4x4(): Array<Pair<String,String>?>{
    val tabuleiro : Array<Pair<String,String>?> = arrayOfNulls(16)
    tabuleiro[2] = TorreB ; tabuleiro[3] = BispoB ; tabuleiro[12] = TorreW ; tabuleiro[13] = QueenW
    return tabuleiro
}

fun board6x7(): Array<Pair<String,String>?>{
    val tabuleiro : Array<Pair<String,String>?> = arrayOfNulls(42)
    tabuleiro[0] = TorreB ; tabuleiro[1] = BispoB ; tabuleiro[2] = QueenB ; tabuleiro[3] = KingB
    tabuleiro[4] = BispoB ; tabuleiro[5] = HorseB ; tabuleiro[6] = PeaoB ; tabuleiro[7] = PeaoB
    tabuleiro[8] = PeaoB ; tabuleiro[9] = PeaoB ;tabuleiro[10] = PeaoB ; tabuleiro[11] = PeaoB
    tabuleiro[41] = HorseW ; tabuleiro[40] = BispoW ; tabuleiro[39] = QueenW ; tabuleiro[38] = KingW
    tabuleiro[37] = BispoW ; tabuleiro[36] = TorreW ; tabuleiro[35] = PeaoW ; tabuleiro[34] = PeaoW
    tabuleiro[33] = PeaoW ; tabuleiro[32] = PeaoW ;tabuleiro[31] = PeaoW ; tabuleiro[30] = PeaoW
    return tabuleiro
}

fun board7x7(): Array<Pair<String,String>?>{
    val tabuleiro : Array<Pair<String,String>?> = arrayOfNulls(49)
    tabuleiro[0] = TorreB ; tabuleiro[1] = HorseB ; tabuleiro[2] = BispoB ; tabuleiro[3] = KingB
    tabuleiro[4] = BispoB ; tabuleiro[5] = HorseB ; tabuleiro [6] = TorreB ;tabuleiro[7] = PeaoB
    tabuleiro[8] = PeaoB ; tabuleiro[9] = PeaoB ; tabuleiro[10] = PeaoB ; tabuleiro[11] = PeaoB
    tabuleiro[12] = PeaoB ; tabuleiro[13] = PeaoB ; tabuleiro[48] = TorreW ; tabuleiro[47] = HorseW
    tabuleiro[46] = BispoW ; tabuleiro[45] = KingW ; tabuleiro[44] = BispoW ; tabuleiro[43] = HorseW
    tabuleiro [42] = TorreW ; tabuleiro[41] = PeaoW ; tabuleiro[40] = PeaoW ; tabuleiro[39] = PeaoW
    tabuleiro[38] = PeaoW ; tabuleiro[37] = PeaoW ; tabuleiro[36] = PeaoW ; tabuleiro[35] = PeaoW
    return tabuleiro
}

fun board6x6(): Array<Pair<String,String>?>{
    val tabuleiro : Array<Pair<String,String>?> = arrayOfNulls(36)
    tabuleiro[0] = HorseB ; tabuleiro[1] = BispoB ; tabuleiro[2] = QueenB ; tabuleiro[3] = KingB
    tabuleiro[4] = BispoB ; tabuleiro[5] = TorreB ; tabuleiro[6] = PeaoB ; tabuleiro[7] = PeaoB
    tabuleiro[8] = PeaoB ; tabuleiro[9] = PeaoB ; tabuleiro[10] = PeaoB ; tabuleiro[11] = PeaoB
    tabuleiro[35] = TorreW ; tabuleiro[34] = BispoW ; tabuleiro[33] = QueenW ; tabuleiro[32] = KingW
    tabuleiro[31] = BispoW ; tabuleiro[30] = HorseW ; tabuleiro[29] = PeaoW ; tabuleiro[28] = PeaoW
    tabuleiro[27] = PeaoW ; tabuleiro[26] = PeaoW ; tabuleiro[25] = PeaoW ; tabuleiro[24] = PeaoW
    return tabuleiro
}


fun verificarCor (pieces: Array<Pair<String, String>?>, currentCoord: Pair<Int, Int>, targetCoord: Pair<Int, Int>, numColumns: Int): Boolean{
    val currentCoordPosicao = (currentCoord.second - 1) + (currentCoord.first - 1) * numColumns
    val targetCoordPosicao = (targetCoord.second - 1) + (targetCoord.first - 1) * numColumns
    val selectedPiece = pieces[currentCoordPosicao]?: Pair("","")
    val targetPiece = pieces[targetCoordPosicao]?: Pair("","")
    return (selectedPiece.second != targetPiece.second)
}


fun buildBoard(numColumns: Int, numLines: Int, showLegend: Boolean= false, showPieces: Boolean= false,
pieces: Array<Pair<String,String>?>): String{
    var count = 0 ; var line = 1 ; var legend = 0
    var tabuleiro = "" ; val esc: String = Character.toString(27.toChar())
    val startBlue = "$esc[30;44m" ; val startGrey = "$esc[30;47m" ; val startWhite = "$esc[30;30m"
    val end = "$esc[0m" ; val blueSquare = "$startBlue   $end"
    if (showLegend){
        tabuleiro += blueSquare
        while (legend < numColumns){
            tabuleiro += "$startBlue ${(65 + legend).toChar()} $end"
            legend++
        }
        tabuleiro += blueSquare
        tabuleiro += "\n"
    }
    while ( line <= numLines){
        if (showLegend){
            tabuleiro += "$startBlue $line $end"
        }
        var column = 1
        while (column <= numColumns){
            var piece : String
            var color : String
            val inicialBoard = pieces[(column - 1) + (line - 1) * numColumns]
            if (inicialBoard == null){
                piece = " "
                color = " "
            }else{
                piece = inicialBoard.first
                color = inicialBoard.second
            }
            val stringToUnicode = convertStringToUnicode(piece,color)
            if ((column + line ) % 2 == 0){
                if (showPieces) {
                    tabuleiro += "$startWhite $stringToUnicode $end"
                    count += 1
                } else {
                    tabuleiro += "$startWhite   $end"
                    count += 1
                }
            } else {
                if (showPieces) {
                    tabuleiro += "$startGrey $stringToUnicode $end"
                    count += 1
                } else {
                    tabuleiro += "$startGrey   $end"
                    count += 1
                }
            }
            column += 1
        }
        if (showLegend){
            tabuleiro += blueSquare
        }
        tabuleiro += "\n"
        line += 1
    }
    if (showLegend){
        legend = 0
        tabuleiro += blueSquare
        while (legend <= numColumns) {
            tabuleiro += blueSquare
            legend++
        }

        tabuleiro += "\n"
    }
    return tabuleiro
}


fun createInitialBoard(numColumns: Int, numLines: Int): Array<Pair<String,String>?> {
    when {
        numColumns == 4 && numLines == 4 -> {
            val tabuleiro4x4 = board4x4()
            return tabuleiro4x4
        } numColumns == 6 && numLines == 7 -> {
            val tabuleiro6x7 = board6x7()
            return tabuleiro6x7
        } numColumns == 6 && numLines == 6 -> {
            val tabuleiro6x6 = board6x6()
            return tabuleiro6x6
        } numColumns == 7 && numLines == 7 -> {
            val tabuleiro7x7 = board7x7()
            return tabuleiro7x7
        } numColumns == 8 && numLines == 8 -> {
            val tabuleiro8x8 = board8x8()
            return tabuleiro8x8
        }
        else -> return arrayOfNulls(0)
    }
}


fun checkRightPieceSelected(pieceColor: String, turn: Int): Boolean {
    when{
        pieceColor == "b" && turn == 1 -> return true
        pieceColor == "w" && turn == 0 -> return true
        else -> return false
    }
}

fun isValidTargetPiece(currentSelectedPiece: Pair<String, String>, currentCoord: Pair<Int, Int>,
targetCoord: Pair<Int,Int>, pieces: Array<Pair<String,String>?>, numColumns: Int, numLines: Int): Boolean {
    val piece = currentSelectedPiece.first
    return when (piece) {
        "P" -> isKnightValid(currentCoord, targetCoord, pieces, numColumns, numLines)
        "H" -> isHorseValid(currentCoord, targetCoord, pieces, numColumns, numLines)
        "K" -> isKingValid(currentCoord, targetCoord, pieces, numColumns, numLines)
        "Q" -> isQueenValid(currentCoord, targetCoord, pieces, numColumns, numLines)
        "B" -> isBishopValid(currentCoord, targetCoord, pieces, numColumns, numLines)
        "T" -> isTowerValid(currentCoord, targetCoord, pieces, numColumns, numLines)
        else -> return false
    }
}

fun movePiece(pieces: Array<Pair<String,String>?>, numColumns: Int, numLines: Int, currentCoord: Pair<Int,Int>,
  targetCoord: Pair<Int,Int>, totalPiecesAndTurn: Array<Int>): Boolean {
    val piecesAndturns = totalPiecesAndTurn
    val totalPieces = pieces
    val currentPiece = totalPieces[(currentCoord.second - 1) + (currentCoord.first - 1) * numColumns]
    val targetPiece = totalPieces[(targetCoord.second - 1) + (targetCoord.first- 1) * numColumns]
    if (currentPiece != null) {
        if (isValidTargetPiece(currentPiece, currentCoord, targetCoord, pieces, numColumns, numLines)){
            if (targetPiece == null) {
                if (piecesAndturns[2] == 0) {
                    totalPieces[(targetCoord.second - 1) + (targetCoord.first - 1) * numColumns] = currentPiece
                    totalPieces[(currentCoord.second - 1) + (currentCoord.first - 1) * numColumns] = null
                    piecesAndturns[2] = 1
                    return true
                } else if (piecesAndturns[2] == 1) {
                    totalPieces[(targetCoord.second - 1) + (targetCoord.first - 1) * numColumns] = currentPiece
                    totalPieces[(currentCoord.second - 1) + (currentCoord.first - 1) * numColumns] = null
                    piecesAndturns[2] = 0
                    return true
                }
            } else if (isValidTargetPiece(currentPiece, currentCoord, targetCoord, pieces, numColumns, numLines)) {
                if (piecesAndturns[2] == 0) {
                    if (currentPiece.second != targetPiece.second) {
                        piecesAndturns[1] = piecesAndturns[1] - 1
                        totalPieces[(targetCoord.second - 1) + (targetCoord.first - 1) * numColumns] = currentPiece
                        totalPieces[(currentCoord.second - 1) + (currentCoord.first - 1) * numColumns] = null
                        piecesAndturns[2] = 1
                        return true
                    }
                } else if (piecesAndturns[2] == 1) {
                    if (currentPiece.second != targetPiece.second) {
                        piecesAndturns[0] = piecesAndturns[0] - 1
                        totalPieces[(targetCoord.second - 1) + (targetCoord.first - 1) * numColumns] = currentPiece
                        totalPieces[(currentCoord.second - 1) + (currentCoord.first - 1) * numColumns] = null
                        piecesAndturns[2] = 0
                        return true
                    }
                }
            }
        }
    }
    return false
}


fun startNewGame(whitePlayer: String, blackPlayer: String, pieces: Array<Pair<String, String>?>,
                 totalPiecesAndTurn: Array<Int?>, numColumns: Int, numLines: Int, showLegend: Boolean = false,
                 showPieces: Boolean = false) {
    val boardPieces = pieces  ; var currentMove = "" ; var targetMove = ""
    val respostaInvalida = "Invalid response." ; val piecesAndTurns : Array<Int> = arrayOf(0,0,0)
    var currentPieces : Pair<String,String>? = Pair("","")
    for (count in 0..2){
        val guardar = totalPiecesAndTurn[count]; piecesAndTurns[count]=guardar?: 0
    }
    while (piecesAndTurns[0] > 0 && piecesAndTurns[1] > 0) {
        var currentCoord : Pair<Int, Int>? = Pair(0,0) ; var targetCoord : Pair<Int, Int>? = Pair (0,0)
        do {
            while (piecesAndTurns[2] == 0) {
                do {
                    println(buildBoard(numColumns,numLines,showLegend,showPieces,boardPieces))
                    println("$whitePlayer, choose a piece (e.g 2D).\nMenu-> m;\n"); currentMove = readLine() ?: ""
                    if (currentMove == "m") { ; return
                    }
                    currentCoord = getCoordinates(currentMove)
                    if (currentCoord != null) {; currentPieces = boardPieces[(currentCoord.second - 1) + (currentCoord.first - 1) * numColumns]
                    }
                    if (currentPieces == null || !checkRightPieceSelected(currentPieces.second,
                                    piecesAndTurns[2])){ ; println(respostaInvalida)
                    }
                }while (currentCoord == null || currentPieces == null)
                println("$whitePlayer, choose a target piece (e.g 2D).\nMenu-> m;\n"); targetMove = readLine() ?: ""
                if (targetMove == "m") { ; return
                }
                targetCoord = getCoordinates(targetMove); if (targetCoord == null){ ; println(respostaInvalida)
                }else{ ; movePiece(boardPieces,numColumns,numLines,currentCoord,targetCoord,piecesAndTurns)
                }
            }
        }while (currentCoord == null && targetCoord == null)
        do {
            while (piecesAndTurns[2] == 1) {
                do {
                    println(buildBoard(numColumns,numLines,showLegend,showPieces,boardPieces))
                    println("$blackPlayer, choose a piece (e.g 2D).\nMenu-> m;\n"); currentMove = readLine() ?: ""
                    if (currentMove == "m") { ; return
                    }
                    currentCoord = getCoordinates(currentMove)
                    if (currentCoord != null){
                        currentPieces = boardPieces[(currentCoord.second - 1)+ (currentCoord.first - 1) * numColumns]
                    }
                    if (currentPieces == null || !checkRightPieceSelected(currentPieces.second,
                                    piecesAndTurns[2])){  ; println(respostaInvalida)
                    }
                }while (currentCoord == null || currentPieces == null)
                println("$blackPlayer, choose a target piece (e.g 2D).\nMenu-> m;\n"); targetMove = readLine() ?: ""
                if (targetMove == "m") { ; return
                }
                targetCoord = getCoordinates(targetMove)
                if (targetCoord == null){ ; println(respostaInvalida)
                }else{
                    movePiece(boardPieces,numColumns,numLines,currentCoord,targetCoord,piecesAndTurns)
                    if (movePiece(boardPieces,numColumns,numLines,currentCoord,targetCoord,piecesAndTurns) == false){
                        println(respostaInvalida)
                    }
                }
            }
        }while (currentCoord == null && targetCoord == null)
    }
    if (piecesAndTurns[0] == 0){ ;println("Congrats! $blackPlayer wins!"); return
    }else if (piecesAndTurns[1] == 0){ ; println("Congrats! $whitePlayer wins!"); return
    }
}


fun checkColumnsAndLines(columns : String, lines : String): Boolean{
    when {
        (columns in "0".."3" || columns >= "9" ) -> {
            return false
        }
        (lines in "0".."3" || lines >= "9" ) -> {
            return false
        }
        (columns == "4" && lines == "4") -> {
            return true
        }
        (columns == "6" && lines == "6")-> {
            return true
        }
        (columns == "6" && lines == "7") -> {
            return true
        }
        (columns== "7" && lines == "7") -> {
            return true
        }
        (columns == "8" && lines == "8") ->{
            return true
        }
        else -> return false
    }
}

fun getCoordinates (readText: String?): Pair<Int, Int>? {
    val coordinates = readText
    var coord1 = 0
    var coord2 = 0
    if (coordinates != null) {
    if (coordinates.length <= 1 || coordinates.length >= 3) {
        return null
    }else {
        when {
            coordinates[0] == '1' -> coord1 = 1
            coordinates[0] == '2' -> coord1 = 2
            coordinates[0] == '3' -> coord1 = 3
            coordinates[0] == '4' -> coord1 = 4
            coordinates[0] == '5' -> coord1 = 5
            coordinates[0] == '6' -> coord1 = 6
            coordinates[0] == '7' -> coord1 = 7
            coordinates[0] == '8' -> coord1 = 8
        }
        when {
            (coordinates[1] == 'a' || coordinates[1] == 'A') -> coord2 = 1
            (coordinates[1] == 'b' || coordinates[1] == 'B') -> coord2 = 2
            (coordinates[1] == 'c' || coordinates[1] == 'C') -> coord2 = 3
            (coordinates[1] == 'd' || coordinates[1] == 'D') -> coord2 = 4
            (coordinates[1] == 'e' || coordinates[1] == 'E') -> coord2 = 5
            (coordinates[1] == 'f' || coordinates[1] == 'F') -> coord2 = 6
            (coordinates[1] == 'g' || coordinates[1] == 'G') -> coord2 = 7
            (coordinates[1] == 'h' || coordinates[1] == 'H') -> coord2 = 8
        }
        if (coord1 in 1..8 && coord2 in 1..8) {
            val coordinatesArray: Pair<Int, Int>? = Pair(coord1, coord2)
            return coordinatesArray
        } else {
            return null
        }
    }
    } else {
        return null
    }
}

fun createTotalPiecesAndTurn(numColumns: Int, numLines: Int): Array<Int?> {
    val piecesAndTurn : Array<Int?>
    if (numColumns in 5..8 && numLines in 5..8){
        val whitePieces = numColumns * 2
        val blackPieces = numColumns * 2
        piecesAndTurn = arrayOf(whitePieces,blackPieces,0)
        return piecesAndTurn
    } else if (numColumns == 4 && numLines == 4){
       piecesAndTurn = arrayOf(2,2,0)
        return piecesAndTurn
    } else {
        piecesAndTurn = arrayOf()
        return piecesAndTurn
    }
}

fun isCoordinateInsideChess (coord: Pair<Int, Int>,numColumns: Int,numLines: Int):Boolean{
    when {
        numColumns == 4 && numLines == 4 -> {
            val coord1 = coord.first
            val coord2 = coord.second
            return (coord1 in 1..4 && coord2 in 1..4)
        } numColumns == 6 && numLines == 7 -> {
            val coord1 = coord.first
            val coord2 = coord.second
            return (coord1 in 1..6 && coord2 in 1..7)
        } numColumns == 6 && numLines == 6 -> {
            val coord1 = coord.first
            val coord2 = coord.second
            return (coord1 in 1..6 && coord2 in 1..6)
        } numColumns == 7 && numLines == 7 -> {
            val coord1 = coord.first
            val coord2 = coord.second
            return (coord1 in 1..7 && coord2 in 1..7)
        } numColumns == 8 && numLines == 8 -> {
            val coord1 = coord.first
            val coord2 = coord.second
            return (coord1 in 1..8 && coord2 in 1..8)
        } else -> return false
    }
}

fun isHorseValid(currentCoord: Pair<Int, Int>,targetCoord : Pair<Int, Int>,
pieces : Array<Pair<String, String>?>,numColumns: Int, numLines: Int): Boolean {
    val first = currentCoord.first
    val second = currentCoord.second
    if (isCoordinateInsideChess(targetCoord, numColumns, numLines) &&
            verificarCor(pieces,currentCoord,targetCoord,numColumns)) {
        val twoDownOneRight: Pair<Int, Int> = Pair((first + 2), (second + 1))
        val twoDownOneLeft: Pair<Int, Int> = Pair((first + 2), (second - 1))
        val oneUpTwoLeft: Pair<Int, Int> = Pair((first - 1), (second - 2))
        val oneUpTwoRight: Pair<Int, Int> = Pair((first - 1), (second + 2))
        val twoUpOneRight: Pair<Int, Int> = Pair((first - 2), (second + 1))
        val twoUpOneLeft: Pair<Int, Int> = Pair((first - 2), (second - 1))
        val oneDownTwoLeft: Pair<Int, Int> = Pair((first + 1), (second - 2))
        val oneDownTwoRight: Pair<Int, Int> = Pair((first + 1), (second + 2))
        return (targetCoord == twoDownOneRight || twoDownOneLeft == targetCoord || oneUpTwoLeft == targetCoord ||
                oneUpTwoRight == targetCoord || twoUpOneRight == targetCoord || twoUpOneLeft == targetCoord ||
                oneDownTwoLeft == targetCoord || oneDownTwoRight == targetCoord)
    }
    return false
}

fun isKingValid(currentCoord: Pair<Int, Int>,targetCoord : Pair<Int, Int>,
pieces: Array<Pair<String, String>?>,numColumns: Int,numLines: Int):Boolean{
    val first = currentCoord.first
    val second= currentCoord.second
    if (isCoordinateInsideChess(targetCoord, numColumns, numLines) &&
            verificarCor(pieces,currentCoord,targetCoord,numColumns)){
        val oneDown:Pair <Int,Int> = Pair((first+1), second)
        val oneUp:Pair <Int,Int> = Pair((first-1), second)
        val oneRight:Pair <Int,Int> = Pair(first, (second+1))
        val oneLeft:Pair <Int,Int> = Pair(first, (second-1))
        val diagonalOneDownOneRight:Pair <Int,Int> = Pair((first+1), (second+1))
        val diagonalOneDownOneLeft:Pair <Int,Int> = Pair((first+1), (second-1))
        val diagonalOneUpOneRight:Pair <Int,Int> = Pair((first-1), (second+1))
        val diagonalOneUpOneLeft:Pair <Int,Int> = Pair((first-1), (second-1))
        return (targetCoord == oneDown || oneUp == targetCoord || oneRight == targetCoord
                || oneLeft == targetCoord || diagonalOneDownOneRight == targetCoord || diagonalOneDownOneLeft == targetCoord
                || diagonalOneUpOneRight == targetCoord || diagonalOneUpOneLeft == targetCoord)
    }

    return false
}

fun isTowerValid(currentCoord: Pair<Int, Int>,targetCoord: Pair<Int, Int>,
pieces: Array<Pair<String, String>?>,numColumns: Int,numLines: Int):Boolean{
    val first = currentCoord.first ; val second = currentCoord.second
        if (isCoordinateInsideChess(targetCoord, numColumns, numLines) &&
                verificarCor(pieces,currentCoord,targetCoord,numColumns)) {
            val validMove = Pair(targetCoord.first, second)
            val validMove2 = Pair(first, targetCoord.second)
            return (targetCoord == validMove || validMove2 == targetCoord)
        }
            return false
}

fun isBishopValid(currentCoord: Pair<Int, Int>,targetCoord: Pair<Int, Int>,
pieces: Array<Pair<String, String>?>,numColumns: Int,numLines: Int): Boolean{
    val first = currentCoord.first
    val second= currentCoord.second
        if (isCoordinateInsideChess(targetCoord, numColumns, numLines) &&
                verificarCor(pieces,currentCoord,targetCoord,numColumns)){
            val validMove:Pair <Int,Int> = Pair((first-1), (second+1))
            val validMove2:Pair <Int,Int> = Pair((first-2), (second+2))
            val validMove3:Pair <Int,Int> = Pair((first-3), (second+3))
            val validMove4:Pair <Int,Int> = Pair((first-4), (second+4))
            val validMove5:Pair <Int,Int> = Pair((first-5), (second+5))
            val validMove6:Pair <Int,Int> = Pair((first-6), (second+6))
            val validMove7:Pair <Int,Int> = Pair((first-7), (second+7))
            val validMove8:Pair <Int,Int> = Pair((first-1), (second-1))
            val validMove9:Pair <Int,Int> = Pair((first-2), (second-2))
            val validMove10:Pair <Int,Int> = Pair((first-3), (second-3))
            val validMove11:Pair <Int,Int> = Pair((first-4), (second-4))
            val validMove12:Pair <Int,Int> = Pair((first-5), (second-5))
            val validMove13:Pair <Int,Int> = Pair((first-6), (second-6))
            val validMove14:Pair <Int,Int> = Pair((first-7), (second-7))
            val validMove15:Pair <Int,Int> = Pair((first+1), (second+1))
            val validMove16:Pair <Int,Int> = Pair((first+2), (second+2))
            val validMove17:Pair <Int,Int> = Pair((first+3), (second+3))
            val validMove18:Pair <Int,Int> = Pair((first+4), (second+4))
            val validMove19:Pair <Int,Int> = Pair((first+5), (second+5))
            val validMove20:Pair <Int,Int> = Pair((first+6), (second+6))
            val validMove21:Pair <Int,Int> = Pair((first+7), (second+7))
            val validMove22:Pair <Int,Int> = Pair((first+1), (second-1))
            val validMove23:Pair <Int,Int> = Pair((first+2), (second-2))
            val validMove24:Pair <Int,Int> = Pair((first+3), (second-3))
            val validMove25:Pair <Int,Int> = Pair((first+4), (second-4))
            val validMove26:Pair <Int,Int> = Pair((first+5), (second-5))
            val validMove27:Pair <Int,Int> = Pair((first+6), (second-6))
            val validMove28:Pair <Int,Int> = Pair((first+7), (second-7))

            return targetCoord == validMove || validMove2 == targetCoord || validMove3 == targetCoord
                    || validMove4 == targetCoord || validMove5 == targetCoord || validMove6 == targetCoord
                    || validMove7 == targetCoord || validMove8 == targetCoord || validMove9 == targetCoord
                    || validMove10 == targetCoord || validMove11 == targetCoord || validMove12 == targetCoord
                    || validMove13 == targetCoord || validMove14 == targetCoord || validMove15 == targetCoord
                    || validMove16 == targetCoord || validMove17 == targetCoord
                    || validMove18 == targetCoord || validMove19 == targetCoord || validMove20 == targetCoord
                    || validMove21 == targetCoord || validMove22 == targetCoord || validMove23 == targetCoord
                    || validMove24 == targetCoord || validMove25 == targetCoord || validMove26 == targetCoord
                    || validMove27 == targetCoord || validMove28 == targetCoord
        }

    return false
}

fun isQueenValid(currentCoord: Pair<Int, Int>,targetCoord: Pair<Int, Int>,
pieces: Array<Pair<String, String>?>,numColumns: Int,numLines: Int):Boolean{
    val first = currentCoord.first
    val second = currentCoord.second
    if (isCoordinateInsideChess(targetCoord, numColumns, numLines) &&
            verificarCor(pieces,currentCoord,targetCoord,numColumns)) {
        val upAndDown = Pair(targetCoord.first, second)
        val leftAndRight = Pair(first, targetCoord.second)
        val diagonalOneUpAndOneRight:Pair <Int,Int> = Pair((first-1), (second+1))
        val diagonalTwoUpAndTwoRight:Pair <Int,Int> = Pair((first-2), (second+2))
        val diagonalThreeUpAndThreeRight:Pair <Int,Int> = Pair((first-3), (second+3))
        val diagonalFourUpAndFourRight:Pair <Int,Int> = Pair((first-4), (second+4))
        val diagonalFiveUpAndFiveRight:Pair <Int,Int> = Pair((first-5), (second+5))
        val diagonalSixUpAndSixRight:Pair <Int,Int> = Pair((first-6), (second+6))
        val diagonalSevenUpAndSevenRight:Pair <Int,Int> = Pair((first-7), (second+7))
        val diagonalOneUpAndOneLeft:Pair <Int,Int> = Pair((first-1), (second-1))
        val diagonalTwoUpAndTwoLeft:Pair <Int,Int> = Pair((first-2), (second-2))
        val diagonalThreeUpAndThreeLeft:Pair <Int,Int> = Pair((first-3), (second-3))
        val diagonalFourUpAndFourLeft:Pair <Int,Int> = Pair((first-4), (second-4))
        val diagonalFiveUpAndFiveLeft:Pair <Int,Int> = Pair((first-5), (second-5))
        val diagonalSixUpAndSixLeft:Pair <Int,Int> = Pair((first-6), (second-6))
        val diagonalSevenUpAndSevenLeft:Pair <Int,Int> = Pair((first-7), (second-7))
        val diagonalOneDownAndOneRight:Pair <Int,Int> = Pair((first+1), (second+1))
        val diagonalTwoDownAndTwoRight:Pair <Int,Int> = Pair((first+2), (second+2))
        val diagonalThreeDownAndThreeRight:Pair <Int,Int> = Pair((first+3), (second+3))
        val diagonalFourDownAndFourRight:Pair <Int,Int> = Pair((first+4), (second+4))
        val diagonalFiveDownAndFiveRight:Pair <Int,Int> = Pair((first+5), (second+5))
        val diagonalSixDownAndSixRight:Pair <Int,Int> = Pair((first+6), (second+6))
        val diagonalSevenDownAndSevenRight:Pair <Int,Int> = Pair((first+7), (second+7))
        val diagonalOneDownAndOneLeft:Pair <Int,Int> = Pair((first+1), (second-1))
        val diagonalTwoDownAndTwoLeft:Pair <Int,Int> = Pair((first+2), (second-2))
        val diagonalThreeDownAndThreeLeft:Pair <Int,Int> = Pair((first+3), (second-3))
        val diagonalFourDownAndFourLeft:Pair <Int,Int> = Pair((first+4), (second-4))
        val diagonalFiveDownAndFiveLeft:Pair <Int,Int> = Pair((first+5), (second-5))
        val diagonalSixDownAndSixLeft:Pair <Int,Int> = Pair((first+6), (second-6))
        val diagonalSevenDownAndSevenLeft:Pair <Int,Int> = Pair((first+7), (second-7))
        return (targetCoord == upAndDown || leftAndRight == targetCoord ||
                targetCoord == diagonalOneUpAndOneRight || diagonalTwoUpAndTwoRight == targetCoord ||
                diagonalThreeUpAndThreeRight == targetCoord
                || diagonalFourUpAndFourRight == targetCoord || diagonalFiveUpAndFiveRight ==
                targetCoord || diagonalSixUpAndSixRight == targetCoord
                || diagonalSevenUpAndSevenRight == targetCoord || diagonalOneUpAndOneLeft == targetCoord ||
                diagonalTwoUpAndTwoLeft == targetCoord
                || diagonalThreeUpAndThreeLeft == targetCoord || diagonalFourUpAndFourLeft == targetCoord ||
                diagonalFiveUpAndFiveLeft == targetCoord
                || diagonalSixUpAndSixLeft == targetCoord || diagonalSevenUpAndSevenLeft == targetCoord ||
                diagonalOneDownAndOneRight == targetCoord
                || diagonalTwoDownAndTwoRight == targetCoord || diagonalThreeDownAndThreeRight == targetCoord
                || diagonalFourDownAndFourRight == targetCoord || diagonalFiveDownAndFiveRight == targetCoord ||
                diagonalSixDownAndSixRight == targetCoord
                || diagonalSevenDownAndSevenRight == targetCoord || diagonalOneDownAndOneLeft == targetCoord ||
                diagonalTwoDownAndTwoLeft == targetCoord
                || diagonalThreeDownAndThreeLeft == targetCoord || diagonalFourDownAndFourLeft == targetCoord ||
                diagonalFiveDownAndFiveLeft == targetCoord
                || diagonalSixDownAndSixLeft == targetCoord || diagonalSevenDownAndSevenLeft == targetCoord)
    }
    return false
}

fun isKnightValid(currentCoord: Pair<Int, Int>,targetCoord: Pair<Int, Int>,
pieces: Array<Pair<String, String>?>,numColumns: Int,numLines: Int):Boolean {
    val first = currentCoord.first
    val second = currentCoord.second
    if (isCoordinateInsideChess(targetCoord, numColumns, numLines) &&
            verificarCor(pieces,currentCoord,targetCoord,numColumns)) {
        val oneDown: Pair<Int, Int>
        val oneUp: Pair<Int, Int>
        oneDown = Pair((first + 1), second)
        oneUp = Pair((first - 1), second)
        return targetCoord == oneDown || oneUp == targetCoord
    }
    return false
}





fun startGame (){
    val respostaInvalida = "Invalid response."; val quantasColunas = "How many chess columns?\n"
    val quantasLinhas = "How many chess lines?\n"
    println("First player name?\n")
    var whitePlayer = readLine()!! ; var checkNamePlayer1 = checkName(whitePlayer)
    while (checkNamePlayer1 == false) {
        println(respostaInvalida); println("First player name?\n")
        whitePlayer = readLine()!!; checkNamePlayer1 = checkName(whitePlayer)
    }
    println("Second player name?\n")
    var blackPlayer = readLine()!! ; var checkNomePlayer2 = checkName(blackPlayer)
    while (checkNomePlayer2 == false) {
        println(respostaInvalida); println("Second player name?\n")
        blackPlayer = readLine()!!; checkNomePlayer2 = checkName(blackPlayer)
    }
    var chessColumns : String
    var checkChessColumns : Boolean
    var chessLines : String
    var checkChessLines : Boolean
    do {
        println(quantasColunas)
        chessColumns = readLine() ?: "1"
        checkChessColumns = checkIsNumber(chessColumns)
        println(quantasLinhas)
        chessLines = readLine() ?: "1"
        checkChessLines = checkIsNumber(chessLines)
        val checkCAndL = checkColumnsAndLines(chessColumns,chessLines)
        when {
            !checkChessColumns -> {
                println(respostaInvalida)
                checkCAndL == false
            }
            checkChessLines == false -> {
                println(respostaInvalida)
                checkCAndL == false
            }
            checkCAndL == false -> {
                println(respostaInvalida)
            }
            else -> checkCAndL == true
        }
    }while (checkCAndL != true)
    println("Show legend (y/n)?\n")
    var legend = readLine()!! ; var checkLegend = showChessLegendOrPieces(legend)
    while (checkLegend == null) {
        println(respostaInvalida); println("Show legend (y/n)?\n")
        legend = readLine()!!; checkLegend = showChessLegendOrPieces(legend)
    }
    println("Show pieces (y/n)?\n")
    var pieces = readLine() ?: "" ; var checkPieces = showChessLegendOrPieces(pieces)
    while (checkPieces == null) {
        println(respostaInvalida); println("Show pieces (y/n)?\n")
        pieces = readLine() ?: ""; checkPieces = showChessLegendOrPieces(pieces)
    }
    val boardPieces = createInitialBoard(chessColumns.toInt(),chessLines.toInt())
    val piecesAndTurns = createTotalPiecesAndTurn(chessColumns.toInt(),chessLines.toInt())
    startNewGame(whitePlayer,blackPlayer,boardPieces,piecesAndTurns,chessColumns.toInt(),chessLines.toInt(),checkLegend,
    checkPieces)
}


fun main() {
    val menuInicial = buildMenu()
    var fimDeJogo = false
    println("Welcome to the Chess Board Game!")
            println(menuInicial)
    var opcaoMenuInicial = readLine()!!.toInt()
    if (opcaoMenuInicial == 2) {
        fimDeJogo = true
    }
    while (fimDeJogo == false) {
        when {
            opcaoMenuInicial == 1 -> startGame()
            opcaoMenuInicial == 2 -> fimDeJogo = false
        }
        println(menuInicial)
        opcaoMenuInicial = readLine()!!.toInt()
        if (opcaoMenuInicial == 2) {
            fimDeJogo = true
        }
    }
}