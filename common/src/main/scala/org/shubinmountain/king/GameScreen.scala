package org.shubinmountain.king

import com.badlogic.gdx._
    import graphics._
        import g2d._
        import glutils._
            import ShapeRenderer.ShapeType

class GameScreen(model: Model) extends Screen {

    private val width = Gdx.graphics.getWidth
    private val height = Gdx.graphics.getHeight

    val cam = new OrthographicCamera(width.toFloat, height.toFloat)
    cam.position.set(width / 2f, height / 2f, 0)
    cam.update

    val mainBatch = new SpriteBatch
    val shapeRenderer = new ShapeRenderer
    shapeRenderer.setProjectionMatrix(cam.combined)

    def render(dt: Float) {
        Gdx.gl.glClearColor(0,0,0,1)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        Gdx.gl.glLineWidth(1)

        mainBatch.begin

        shapeRenderer.begin(ShapeType.Filled)
        shapeRenderer.end

        mainBatch.end
    }

    def resize(w: Int, h: Int) {

    }

    def show() {}

    def hide() {}

    def pause() {}

    def resume() {}

    def dispose() {
        mainBatch.dispose
        shapeRenderer.dispose
    }

}

// vim: set ts=4 sw=4 et:
