package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzn {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
        Notification.Action.Builder allowGeneratedReplies;
        allowGeneratedReplies = builder.setAllowGeneratedReplies(z);
        return allowGeneratedReplies;
    }

    public static Typeface b(Context context, ebv[] ebvVarArr) {
        return eau.c(context, ebvVarArr, 0);
    }

    public static Typeface c(Context context, List list, int i, boolean z, int i2, Handler handler, dzm dzmVar) {
        Handler handler2;
        ebx ebxVar = new ebx(handler, 0);
        Object obj = null;
        fvq fvqVar = new fvq(dzmVar, ebxVar, (char[]) null);
        if (z) {
            if (list.size() <= 1) {
                ebq ebqVar = (ebq) list.get(0);
                ul ulVar = ebu.a;
                String a = ebu.a(fvq.p(new Object[]{ebqVar}), i);
                Typeface typeface = (Typeface) ebu.a.b(a);
                if (typeface != null) {
                    fvqVar.G(new atal(typeface));
                    obj = typeface;
                } else if (i2 == -1) {
                    atal b = ebu.b(a, context, fvq.p(new Object[]{ebqVar}), i);
                    fvqVar.G(b);
                    obj = b.b;
                } else {
                    try {
                        atal atalVar = (atal) dzo.b(ebu.b, new ebr(a, context, ebqVar, i), i2);
                        fvqVar.G(atalVar);
                        obj = atalVar.b;
                    } catch (InterruptedException unused) {
                        fvqVar.G(new atal(-3, (char[]) null));
                    }
                }
            } else {
                throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
            }
        } else {
            String a2 = ebu.a(list, i);
            Typeface typeface2 = (Typeface) ebu.a.b(a2);
            if (typeface2 != null) {
                fvqVar.G(new atal(typeface2));
                obj = typeface2;
            } else {
                ebt ebtVar = new ebt(fvqVar, 1);
                synchronized (ebu.c) {
                    ArrayList arrayList = (ArrayList) ebu.d.get(a2);
                    if (arrayList != null) {
                        arrayList.add(ebtVar);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(ebtVar);
                        ebu.d.put(a2, arrayList2);
                        ebs ebsVar = new ebs(a2, context, list, i);
                        ExecutorService executorService = ebu.b;
                        ebt ebtVar2 = new ebt(a2, 0);
                        if (Looper.myLooper() == null) {
                            handler2 = new Handler(Looper.getMainLooper());
                        } else {
                            handler2 = new Handler();
                        }
                        executorService.execute(new hjw(handler2, ebsVar, ebtVar2, 1));
                    }
                }
            }
        }
        return (Typeface) obj;
    }

    public static int d(int i) {
        return e(i, 0, 0, 0);
    }

    public static int e(int i, int i2, int i3, int i4) {
        return f(i, i2, i3, 0, 128, i4);
    }

    public static int f(int i, int i2, int i3, int i4, int i5, int i6) {
        return i | i2 | i3 | i4 | i5 | i6;
    }

    public static int g(int i) {
        return i & 384;
    }

    public static int h(int i) {
        return i & 7;
    }

    public static int i(int i) {
        return i & 64;
    }

    public static boolean j(int i, boolean z) {
        int h = h(i);
        if (h == 4) {
            return true;
        }
        if (z && h == 3) {
            return true;
        }
        return false;
    }

    public static float[] k(eyc eycVar) {
        int i;
        int i2;
        Matrix f = eycVar.f();
        float[][] fArr = eyd.a;
        float[] fArr2 = new float[9];
        f.getValues(fArr2);
        float[] fArr3 = new float[16];
        fArr3[10] = 1.0f;
        for (int i3 = 0; i3 < 3; i3++) {
            for (int i4 = 0; i4 < 3; i4++) {
                if (i3 == 2) {
                    i = 3;
                } else {
                    i = i3;
                }
                if (i4 == 2) {
                    i2 = 3;
                } else {
                    i2 = i4;
                }
                fArr3[(i * 4) + i2] = fArr2[(i3 * 3) + i4];
            }
        }
        float[] fArr4 = new float[16];
        android.opengl.Matrix.transposeM(fArr4, 0, fArr3, 0);
        return fArr4;
    }

    public static atal l(Context context, ebq ebqVar) {
        return ebp.a(context, fvq.p(new Object[]{ebqVar}));
    }
}
