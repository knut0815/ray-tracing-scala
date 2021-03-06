/**
  * 3D Vector
  *
  * @param x
  * @param y
  * @param z
  */
case class Vector3D(x: Float, y: Float, z: Float) {

  def +(that: Vector3D): Vector3D =
    Vector3D(x + that.x, y + that.y, z + that.z)

  def -(that: Vector3D): Vector3D =
    this + (-that)

  def unary_- = Vector3D(-x, -y, -z)


  def *(f: Float): Vector3D =
    Vector3D(x*f, y*f, z*f)

  def /(f: Float): Vector3D =
    Vector3D(x/f, y/f, z/f)

  def norm: Float =
    Math.sqrt(x*x + y*y + z*z).toFloat

  def normalize: Vector3D =
    this / norm

  def dot(that: Vector3D): Float =
    x*that.x + y*that.y + z*that.z

  // (from: https://www.khronos.org/registry/OpenGL-Refpages/gl4/html/cross.xhtml)
  def cross(that: Vector3D): Vector3D =
    Vector3D(
      y*that.z - that.y * z,
      z*that.x - that.z * x,
      x*that.y - that.x * y
    )

  def applyElem(f: Float => Float): Vector3D =
    Vector3D(f(x), f(y), f(z))

  def abs: Vector3D =
    Vector3D(x.abs, y.abs, z.abs)


}
