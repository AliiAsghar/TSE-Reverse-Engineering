package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etr {
    public final Map a;
    public boolean b;
    private final int c;
    private final etp[] d;
    private final etq[] e;
    private final Map f;

    public etr(Context context, String str, String str2) {
        this(eul.N(context, str), eul.N(context, str2));
    }

    public static int b(byte[] bArr) {
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i < length) {
                if (bArr[i] == 0) {
                    return i;
                }
                i++;
            } else {
                return length;
            }
        }
    }

    private static void l(int i, int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        boolean z = false;
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        int i3 = iArr[0];
        String str2 = GLES20.glGetShaderInfoLog(glCreateShader) + ", source: \n" + str;
        if (i3 == 1) {
            z = true;
        }
        ett.n(z, str2);
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        ett.m();
    }

    public final int a(String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.c, str);
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        ett.m();
        return glGetAttribLocation;
    }

    public final int c(String str) {
        return GLES20.glGetUniformLocation(this.c, str);
    }

    public final void d() {
        int i;
        int i2 = 0;
        while (true) {
            etp[] etpVarArr = this.d;
            if (i2 >= etpVarArr.length) {
                break;
            }
            etp etpVar = etpVarArr[i2];
            Buffer buffer = etpVar.c;
            d.aC(buffer, "call setBuffer before bind");
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(etpVar.b, etpVar.d, 5126, false, 0, buffer);
            GLES20.glEnableVertexAttribArray(etpVar.b);
            ett.m();
            i2++;
        }
        for (etq etqVar : this.e) {
            boolean z = this.b;
            int i3 = etqVar.c;
            if (i3 != 5124) {
                if (i3 != 5126) {
                    if (i3 != 35678 && i3 != 35815 && i3 != 36198) {
                        switch (i3) {
                            case 35664:
                                GLES20.glUniform2fv(etqVar.b, 1, etqVar.d, 0);
                                ett.m();
                                break;
                            case 35665:
                                GLES20.glUniform3fv(etqVar.b, 1, etqVar.d, 0);
                                ett.m();
                                break;
                            case 35666:
                                GLES20.glUniform4fv(etqVar.b, 1, etqVar.d, 0);
                                ett.m();
                                break;
                            case 35667:
                                GLES20.glUniform2iv(etqVar.b, 1, etqVar.e, 0);
                                ett.m();
                                break;
                            case 35668:
                                GLES20.glUniform3iv(etqVar.b, 1, etqVar.e, 0);
                                ett.m();
                                break;
                            case 35669:
                                GLES20.glUniform4iv(etqVar.b, 1, etqVar.e, 0);
                                ett.m();
                                break;
                            default:
                                switch (i3) {
                                    case 35675:
                                        GLES20.glUniformMatrix3fv(etqVar.b, 1, false, etqVar.d, 0);
                                        ett.m();
                                        break;
                                    case 35676:
                                        GLES20.glUniformMatrix4fv(etqVar.b, 1, false, etqVar.d, 0);
                                        ett.m();
                                        break;
                                    default:
                                        throw new IllegalStateException(a.bV(i3, "Unexpected uniform type: "));
                                }
                        }
                    } else if (etqVar.f != 0) {
                        GLES20.glActiveTexture(etqVar.g + 33984);
                        ett.m();
                        int i4 = etqVar.c;
                        if (i4 == 35678) {
                            i = 3553;
                        } else {
                            i = 36197;
                        }
                        int i5 = etqVar.f;
                        int i6 = 9729;
                        if (i4 != 35678 && z) {
                            i6 = 9728;
                        }
                        ett.l(i, i5, i6);
                        GLES20.glUniform1i(etqVar.b, etqVar.g);
                        ett.m();
                    } else {
                        throw new IllegalStateException("No call to setSamplerTexId() before bind.");
                    }
                } else {
                    GLES20.glUniform1fv(etqVar.b, 1, etqVar.d, 0);
                    ett.m();
                }
            } else {
                GLES20.glUniform1iv(etqVar.b, 1, etqVar.e, 0);
                ett.m();
            }
        }
    }

    public final void e() {
        GLES20.glDeleteProgram(this.c);
        ett.m();
    }

    public final void f(String str, float f) {
        etq etqVar = (etq) this.a.get(str);
        dzg.g(etqVar);
        etqVar.d[0] = f;
    }

    public final void g(String str, float[] fArr) {
        etq etqVar = (etq) this.a.get(str);
        dzg.g(etqVar);
        etqVar.a(fArr);
    }

    public final void h(String str, int i) {
        etq etqVar = (etq) this.a.get(str);
        dzg.g(etqVar);
        etqVar.e[0] = i;
    }

    public final void i(String str, int i, int i2) {
        etq etqVar = (etq) this.a.get(str);
        dzg.g(etqVar);
        etqVar.f = i;
        etqVar.g = i2;
    }

    public final void j() {
        GLES20.glUseProgram(this.c);
        ett.m();
    }

    public final void k(float[] fArr) {
        etp etpVar = (etp) this.f.get("aFramePosition");
        dzg.g(etpVar);
        etpVar.c = ett.k(fArr);
        etpVar.d = 4;
    }

    public etr(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        this.c = glCreateProgram;
        ett.m();
        l(glCreateProgram, 35633, str);
        l(glCreateProgram, 35632, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        ett.n(iArr[0] == 1, "Unable to link shader program: \n".concat(String.valueOf(GLES20.glGetProgramInfoLog(glCreateProgram))));
        GLES20.glUseProgram(glCreateProgram);
        this.f = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.d = new etp[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            int i2 = this.c;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i2, 35722, iArr3, 0);
            int i3 = iArr3[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i2, i, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str3 = new String(bArr, 0, b(bArr));
            etp etpVar = new etp(str3, GLES20.glGetAttribLocation(i2, str3));
            this.d[i] = etpVar;
            this.f.put(etpVar.a, etpVar);
        }
        this.a = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.c, 35718, iArr4, 0);
        this.e = new etq[iArr4[0]];
        for (int i4 = 0; i4 < iArr4[0]; i4++) {
            int i5 = this.c;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i5, 35719, iArr5, 0);
            int[] iArr6 = new int[1];
            int i6 = iArr5[0];
            byte[] bArr2 = new byte[i6];
            GLES20.glGetActiveUniform(i5, i4, i6, new int[1], 0, new int[1], 0, iArr6, 0, bArr2, 0);
            String str4 = new String(bArr2, 0, b(bArr2));
            etq etqVar = new etq(str4, GLES20.glGetUniformLocation(i5, str4), iArr6[0]);
            this.e[i4] = etqVar;
            this.a.put(etqVar.a, etqVar);
        }
        ett.m();
    }
}
