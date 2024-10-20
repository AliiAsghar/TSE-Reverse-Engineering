package androidx.compose.ui.input.pointer;

import defpackage.cga;
import defpackage.crx;
import defpackage.cyg;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends cyg<crx> {
    private final Object a;
    private final Object b;
    private final Object[] c;
    private final PointerInputEventHandler d;

    public /* synthetic */ SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i) {
        this.a = 1 == (i & 1) ? null : obj;
        this.b = (i & 2) != 0 ? null : obj2;
        this.c = (i & 4) != 0 ? null : objArr;
        this.d = pointerInputEventHandler;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new crx(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        crx crxVar = (crx) cVar;
        Object obj = crxVar.a;
        Object obj2 = this.a;
        boolean z = true;
        boolean z2 = !d.F(obj, obj2);
        crxVar.a = obj2;
        Object obj3 = crxVar.b;
        Object obj4 = this.b;
        boolean z3 = !d.F(obj3, obj4);
        crxVar.b = obj4;
        Object[] objArr = crxVar.c;
        boolean z4 = z2 | z3;
        Object[] objArr2 = this.c;
        if (objArr != null && objArr2 == null) {
            z4 = true;
        }
        if (objArr == null && objArr2 != null) {
            z4 = true;
        }
        if (objArr == null || objArr2 == null || Arrays.equals(objArr2, objArr)) {
            z = z4;
        }
        PointerInputEventHandler pointerInputEventHandler = this.d;
        crxVar.c = objArr2;
        if (crxVar.d.getClass() != pointerInputEventHandler.getClass() || z) {
            crxVar.p();
        }
        crxVar.d = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!d.F(this.a, suspendPointerInputElement.a) || !d.F(this.b, suspendPointerInputElement.b)) {
            return false;
        }
        Object[] objArr = this.c;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.c;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.c != null) {
            return false;
        }
        if (this.d == suspendPointerInputElement.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        Object obj = this.a;
        int i3 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        Object obj2 = this.b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = i * 31;
        Object[] objArr = this.c;
        if (objArr != null) {
            i3 = Arrays.hashCode(objArr);
        }
        return ((((i4 + i2) * 31) + i3) * 31) + this.d.hashCode();
    }
}
