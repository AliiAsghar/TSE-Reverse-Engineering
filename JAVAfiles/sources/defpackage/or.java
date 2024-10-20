package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.apps.messaging.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class or {
    private static or b;
    private WeakHashMap c;
    private final WeakHashMap d = new WeakHashMap(0);
    private TypedValue e;
    private boolean f;
    private gbl h;
    private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static final ul g = new ul(6);

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        synchronized (or.class) {
            ul ulVar = g;
            PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) ulVar.b(Integer.valueOf(ul.e(i, mode)));
            if (porterDuffColorFilter == null) {
                PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, mode);
                return porterDuffColorFilter2;
            }
            return porterDuffColorFilter;
        }
    }

    public static synchronized or e() {
        or orVar;
        synchronized (or.class) {
            if (b == null) {
                b = new or();
            }
            orVar = b;
        }
        return orVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(Drawable drawable, pu puVar, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (!puVar.d) {
                if (puVar.c) {
                    colorStateList = null;
                } else {
                    drawable.clearColorFilter();
                    return;
                }
            } else {
                colorStateList = puVar.a;
            }
            if (puVar.c) {
                mode = puVar.b;
            } else {
                mode = a;
            }
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = b(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    private final synchronized Drawable i(Context context, long j) {
        WeakReference weakReference;
        uj ujVar = (uj) this.d.get(context);
        if (ujVar != null && (weakReference = (WeakReference) ujVar.d(j)) != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            ujVar.i(j);
        }
        return null;
    }

    private final synchronized void j(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            uj ujVar = (uj) this.d.get(context);
            if (ujVar == null) {
                ujVar = new uj();
                this.d.put(context, ujVar);
            }
            ujVar.h(j, new WeakReference(constantState));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized ColorStateList a(Context context, int i) {
        ColorStateList colorStateList;
        vm vmVar;
        WeakHashMap weakHashMap = this.c;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (vmVar = (vm) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) vn.a(vmVar, i);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            gbl gblVar = this.h;
            if (gblVar != null) {
                if (i == R.drawable.abc_edit_text_material) {
                    colorStateList2 = egl.f(context, R.color.abc_tint_edittext);
                } else if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                    colorStateList2 = egl.f(context, R.color.abc_tint_switch_track);
                } else if (i == R.drawable.abc_switch_thumb_material) {
                    int[][] iArr = new int[3];
                    int[] iArr2 = new int[3];
                    ColorStateList c = pr.c(context, R.attr.colorSwitchThumbNormal);
                    if (c != null && c.isStateful()) {
                        int[] iArr3 = pr.a;
                        iArr[0] = iArr3;
                        iArr2[0] = c.getColorForState(iArr3, 0);
                        iArr[1] = pr.d;
                        iArr2[1] = pr.b(context, R.attr.colorControlActivated);
                        iArr[2] = pr.e;
                        iArr2[2] = c.getDefaultColor();
                    } else {
                        iArr[0] = pr.a;
                        iArr2[0] = pr.a(context, R.attr.colorSwitchThumbNormal);
                        iArr[1] = pr.d;
                        iArr2[1] = pr.b(context, R.attr.colorControlActivated);
                        iArr[2] = pr.e;
                        iArr2[2] = pr.b(context, R.attr.colorSwitchThumbNormal);
                    }
                    colorStateList2 = new ColorStateList(iArr, iArr2);
                } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
                    colorStateList2 = gbl.e(context, pr.b(context, R.attr.colorButtonNormal));
                } else if (i == R.drawable.abc_btn_borderless_material) {
                    colorStateList2 = gbl.e(context, 0);
                } else if (i == R.drawable.abc_btn_colored_material) {
                    colorStateList2 = gbl.e(context, pr.b(context, R.attr.colorAccent));
                } else {
                    if (i != R.drawable.abc_spinner_mtrl_am_alpha && i != R.drawable.abc_spinner_textfield_background_material) {
                        if (gbl.d((int[]) gblVar.e, i)) {
                            colorStateList2 = pr.c(context, R.attr.colorControlNormal);
                        } else if (gbl.d((int[]) gblVar.a, i)) {
                            colorStateList2 = egl.f(context, R.color.abc_tint_default);
                        } else if (gbl.d((int[]) gblVar.d, i)) {
                            colorStateList2 = egl.f(context, R.color.abc_tint_btn_checkable);
                        } else if (i == R.drawable.abc_seekbar_thumb_material) {
                            colorStateList2 = egl.f(context, R.color.abc_tint_seek_thumb);
                            i = R.drawable.abc_seekbar_thumb_material;
                        }
                    }
                    colorStateList2 = egl.f(context, R.color.abc_tint_spinner);
                }
            }
            if (colorStateList2 != null) {
                if (this.c == null) {
                    this.c = new WeakHashMap();
                }
                vm vmVar2 = (vm) this.c.get(context);
                if (vmVar2 == null) {
                    vmVar2 = new vm();
                    this.c.put(context, vmVar2);
                }
                int i2 = vmVar2.d;
                if (i2 != 0 && i <= vmVar2.b[i2 - 1]) {
                    vmVar2.f(i, colorStateList2);
                } else {
                    if (vmVar2.a && i2 >= vmVar2.b.length) {
                        vn.b(vmVar2);
                    }
                    int i3 = vmVar2.d;
                    int[] iArr4 = vmVar2.b;
                    if (i3 >= iArr4.length) {
                        int d = vp.d(i3 + 1);
                        int[] copyOf = Arrays.copyOf(iArr4, d);
                        copyOf.getClass();
                        vmVar2.b = copyOf;
                        Object[] copyOf2 = Arrays.copyOf(vmVar2.c, d);
                        copyOf2.getClass();
                        vmVar2.c = copyOf2;
                    }
                    vmVar2.b[i3] = i;
                    vmVar2.c[i3] = colorStateList2;
                    vmVar2.d = i3 + 1;
                }
                return colorStateList2;
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ce, code lost:
    
        r0.setTintMode(r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ae A[Catch: all -> 0x01bd, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0007, B:7:0x002d, B:9:0x0031, B:10:0x0038, B:14:0x00ad, B:16:0x00b3, B:18:0x00b9, B:22:0x00ce, B:25:0x01ae, B:31:0x00ca, B:32:0x00d4, B:36:0x00eb, B:40:0x011d, B:42:0x014b, B:48:0x0193, B:50:0x01a4, B:51:0x015c, B:54:0x0168, B:56:0x0175, B:59:0x017d, B:67:0x005c, B:71:0x00a3, B:74:0x0067, B:76:0x0084, B:78:0x008e, B:80:0x0098, B:81:0x000e, B:83:0x0019, B:85:0x001d, B:87:0x01b3, B:88:0x01bc), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0193 A[Catch: all -> 0x01bd, TryCatch #0 {, blocks: (B:4:0x0007, B:7:0x002d, B:9:0x0031, B:10:0x0038, B:14:0x00ad, B:16:0x00b3, B:18:0x00b9, B:22:0x00ce, B:25:0x01ae, B:31:0x00ca, B:32:0x00d4, B:36:0x00eb, B:40:0x011d, B:42:0x014b, B:48:0x0193, B:50:0x01a4, B:51:0x015c, B:54:0x0168, B:56:0x0175, B:59:0x017d, B:67:0x005c, B:71:0x00a3, B:74:0x0067, B:76:0x0084, B:78:0x008e, B:80:0x0098, B:81:0x000e, B:83:0x0019, B:85:0x001d, B:87:0x01b3, B:88:0x01bc), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a3 A[Catch: all -> 0x01bd, TryCatch #0 {, blocks: (B:4:0x0007, B:7:0x002d, B:9:0x0031, B:10:0x0038, B:14:0x00ad, B:16:0x00b3, B:18:0x00b9, B:22:0x00ce, B:25:0x01ae, B:31:0x00ca, B:32:0x00d4, B:36:0x00eb, B:40:0x011d, B:42:0x014b, B:48:0x0193, B:50:0x01a4, B:51:0x015c, B:54:0x0168, B:56:0x0175, B:59:0x017d, B:67:0x005c, B:71:0x00a3, B:74:0x0067, B:76:0x0084, B:78:0x008e, B:80:0x0098, B:81:0x000e, B:83:0x0019, B:85:0x001d, B:87:0x01b3, B:88:0x01bc), top: B:3:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.drawable.Drawable d(android.content.Context r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.or.d(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized void f(Context context) {
        uj ujVar = (uj) this.d.get(context);
        if (ujVar != null) {
            ujVar.g();
        }
    }

    public final synchronized void h(gbl gblVar) {
        this.h = gblVar;
    }
}
