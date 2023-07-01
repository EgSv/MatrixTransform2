package ru.startandroid.develop.matrixtransform2

import android.content.Context
import android.graphics.*
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(DrawView(this))
    }

    /*internal inner class DrawView(context: Context): View(context) {

        private var p: Paint = Paint()
        private var path: Path
        private var pathDst: Path
        private var rectfBounds: RectF
        private var rectfDst: RectF
        private var matriX: Matrix

        init {
            p.strokeWidth = 3f
            p.style = Paint.Style.STROKE

            rectfDst = RectF()
            rectfBounds = RectF()

            path = Path()
            path.addCircle(200f, 100f, 50f, Path.Direction.CW)
            path.addCircle(200f, 225f, 75f, Path.Direction.CW)
            path.addCircle(200f, 400f, 100f, Path.Direction.CW)

            pathDst = Path()
            matriX = Matrix()
        }

        override fun onDraw(canvas: Canvas) {
            canvas.drawARGB(80, 102, 204, 255)

            rectfDst[500f, 50f, 800f] = 150f

            p.color = Color.BLUE
            canvas.drawPath(path, p)

            path.computeBounds(rectfBounds, true)
            p.color = Color.GREEN
            canvas.drawRect(rectfBounds, p)

            p.color = Color.BLACK
            canvas.drawRect(rectfDst, p)

            matriX.reset()
            matriX.setRectToRect(rectfBounds, rectfDst, Matrix.ScaleToFit.START)
            path.transform(matriX, pathDst)

            p.color = Color.BLUE
            canvas.drawPath(pathDst, p)

            rectfDst.offset(0f, 150f)

            p.color = Color.BLACK
            canvas.drawRect(rectfDst, p)

            matriX.reset()
            matriX.setRectToRect(rectfBounds, rectfDst, Matrix.ScaleToFit.CENTER)
            path.transform(matriX, pathDst)

            p.color = Color.BLUE
            canvas.drawPath(pathDst, p)

            rectfDst.offset(0f, 150f)

            p.color = Color.BLACK
            canvas.drawRect(rectfDst, p)

            matriX.reset()
            matriX.setRectToRect(rectfBounds, rectfDst, Matrix.ScaleToFit.END)
            path.transform(matriX, pathDst)

            p.color = Color.BLUE
            canvas.drawPath(pathDst, p)

            rectfDst.offset(0f, 150f)

            p.color = Color.BLACK
            canvas.drawRect(rectfDst, p)
            // преобразование
            matriX.reset()
            matriX.setRectToRect(rectfBounds, rectfDst, Matrix.ScaleToFit.FILL)
            path.transform(matriX, pathDst)
            // снеговик
            p.color = Color.BLUE
            canvas.drawPath(pathDst, p)
        }
    }

     */

    /*internal inner class DrawView(context: Context): View(context) {
        private var p: Paint = Paint()
        private var path: Path
        private var pathDst: Path
        private var rectf: RectF
        private var matriX: Matrix
        private var src = floatArrayOf()
        private var dst = floatArrayOf()

        init {
            p.strokeWidth = 3f
            p.style = Paint.Style.STROKE

            path = Path()
            pathDst = Path()
            matriX = Matrix()

            rectf = RectF(100f, 100f, 200f, 200f)
            src = floatArrayOf(100f, 100f)
            dst = floatArrayOf(150f, 120f)
        }

        override fun onDraw(canvas: Canvas?) {
            canvas!!.drawARGB(80, 102, 204, 255)

            path.reset()
            path.addRect(rectf, Path.Direction.CW)
            p.color = Color.GREEN
            canvas.drawPath(path, p)

            matriX.setPolyToPoly(src, 0, dst, 0, 1)
            path.transform(matriX, pathDst)

            p.color = Color.BLUE
            canvas.drawPath(pathDst, p)
        }
    }

     */

    /*internal inner class DrawView(context: Context): View(context) {
        private var p: Paint = Paint()
        private var pBlack: Paint
        private var path: Path
        private var pathDst: Path
        private var rectf: RectF
        private var matriX: Matrix
        private var src = floatArrayOf()
        private var dst = floatArrayOf()
        private var dst2 = floatArrayOf()
        private var points: Int = 2

        init {
            p.strokeWidth = 3f
            p.style = Paint.Style.STROKE

            pBlack = Paint()
            pBlack.color = Color.BLACK
            pBlack.strokeWidth = 3f

            path = Path()
            pathDst = Path()
            matriX = Matrix()

            rectf = RectF(100f, 100f, 200f, 200f)
            src = floatArrayOf(100f, 100f, 200f, 200f)
            dst = floatArrayOf(50f, 300f, 250f, 500f)
            dst2 = floatArrayOf(400f, 200f, 500f, 200f)
        }

        override fun onDraw(canvas: Canvas?) {
            canvas!!.drawARGB(80, 102, 204, 255)

            path.reset()
            path.addRect(rectf, Path.Direction.CW)
            p.color = Color.GREEN
            canvas.drawPath(path, p)
            canvas.drawLine(src[0], src[1], src[2], src[3], pBlack)

            matriX.setPolyToPoly(src, 0, dst, 0, points)
            path.transform(matriX, pathDst)

            p.color = Color.BLUE
            canvas.drawPath(pathDst, p)
            canvas.drawLine(dst[0], dst[1], dst[2], dst[3], pBlack)

            matriX.setPolyToPoly(src, 0, dst2, 0, points)
            path.transform(matriX, pathDst)

            p.color = Color.RED
            canvas.drawPath(pathDst, p)
            canvas.drawLine(dst2[0], dst2[1], dst2[2], dst2[3], pBlack)
        }
    }

     */

    /*internal class DrawView(context: Context?) : View(context) {
        private var p: Paint = Paint()
        private var pBlack: Paint
        private var pGray: Paint
        private var path: Path
        private var pathDst: Path
        private var rectf: RectF
        private var matriX: Matrix
        private var src: FloatArray
        private var dst: FloatArray
        private var dst2: FloatArray
        private var points = 3

        init {
            p.strokeWidth = 3f
            p.style = Paint.Style.STROKE
            pGray = Paint()
            pGray.color = Color.GRAY
            pGray.strokeWidth = 3f
            pBlack = Paint()
            pBlack.color = Color.BLACK
            pBlack.strokeWidth = 3f
            path = Path()
            pathDst = Path()
            matriX = Matrix()
            rectf = RectF(100f, 100f, 200f, 200f)
            src = floatArrayOf(100f, 100f, 200f, 200f, 200f, 100f)
            dst = floatArrayOf(50f, 300f, 250f, 500f, 230f, 350f)
            dst2 = floatArrayOf(400f, 200f, 500f, 200f, 440f, 100f)
        }

        override fun onDraw(canvas: Canvas) {
            canvas.drawARGB(80, 102, 204, 255)


            path.reset()
            path.addRect(rectf, Path.Direction.CW)
            p.color = Color.GREEN
            canvas.drawPath(path, p)
            canvas.drawLine(src[0], src[1], src[2], src[3], pBlack)
            canvas.drawLine(src[0], src[1], src[4], src[5], pGray)


            matriX.setPolyToPoly(src, 0, dst, 0, points)
            path.transform(matriX, pathDst)

            p.color = Color.BLUE
            canvas.drawPath(pathDst, p)
            canvas.drawLine(dst[0], dst[1], dst[2], dst[3], pBlack)
            canvas.drawLine(dst[0], dst[1], dst[4], dst[5], pGray)


            matriX.setPolyToPoly(src, 0, dst2, 0, points)
            path.transform(matriX, pathDst)

            p.color = Color.RED
            canvas.drawPath(pathDst, p)
            canvas.drawLine(dst2[0], dst2[1], dst2[2], dst2[3], pBlack)
            canvas.drawLine(dst2[0], dst2[1], dst2[4], dst2[5], pGray)
        }
    }

     */

    internal class DrawView(context: Context?) : View(context) {
        private var p: Paint = Paint()
        private var pBlack: Paint
        private var pGray: Paint
        private var pWhite: Paint
        private var path: Path
        private var pathDst: Path
        private var rectf: RectF
        private var matriX: Matrix
        private var src: FloatArray
        private var dst: FloatArray
        private var dst2: FloatArray
        private var points = 4

        init {
            p.strokeWidth = 3f
            p.style = Paint.Style.STROKE
            pGray = Paint()
            pGray.color = Color.GRAY
            pGray.strokeWidth = 3f
            pBlack = Paint()
            pBlack.color = Color.BLACK
            pBlack.strokeWidth = 3f
            pWhite = Paint()
            pWhite.color = Color.WHITE
            pWhite.strokeWidth = 3f
            path = Path()
            pathDst = Path()
            matriX = Matrix()
            rectf = RectF(100f, 100f, 200f, 200f)
            src = floatArrayOf(100f, 100f, 200f, 200f, 200f, 100f, 100f, 200f)
            dst = floatArrayOf(50f, 300f, 250f, 500f, 230f, 350f, 40f, 550f)
            dst2 = floatArrayOf(400f, 200f, 500f, 200f, 440f, 100f, 440f, 230f)
        }

        override fun onDraw(canvas: Canvas) {
            canvas.drawARGB(80, 102, 204, 255)

            path.reset()
            path.addRect(rectf, Path.Direction.CW)
            p.color = Color.GREEN
            canvas.drawPath(path, p)
            canvas.drawLine(src[0], src[1], src[2], src[3], pBlack)
            canvas.drawLine(src[0], src[1], src[4], src[5], pGray)
            canvas.drawLine(src[0], src[1], src[6], src[7], pWhite)


            matriX.setPolyToPoly(src, 0, dst, 0, points)
            path.transform(matriX, pathDst)

            p.color = Color.BLUE
            canvas.drawPath(pathDst, p)
            canvas.drawLine(dst[0], dst[1], dst[2], dst[3], pBlack)
            canvas.drawLine(dst[0], dst[1], dst[4], dst[5], pGray)
            canvas.drawLine(dst[0], dst[1], dst[6], dst[7], pWhite)

            matriX.setPolyToPoly(src, 0, dst2, 0, points)
            path.transform(matriX, pathDst)

            p.color = Color.RED
            canvas.drawPath(pathDst, p)
            canvas.drawLine(dst2[0], dst2[1], dst2[2], dst2[3], pBlack)
            canvas.drawLine(dst2[0], dst2[1], dst2[4], dst2[5], pGray)
            canvas.drawLine(dst2[0], dst2[1], dst2[6], dst2[7], pWhite)
        }
    }
}