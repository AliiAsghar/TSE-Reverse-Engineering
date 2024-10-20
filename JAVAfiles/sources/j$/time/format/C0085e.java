package j$.time.format;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0085e implements InterfaceC0086f {
    private final InterfaceC0086f[] a;
    private final boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0085e(ArrayList arrayList, boolean z) {
        this((InterfaceC0086f[]) arrayList.toArray(new InterfaceC0086f[arrayList.size()]), z);
    }

    public final C0085e a() {
        if (!this.b) {
            return this;
        }
        return new C0085e(this.a, false);
    }

    @Override // j$.time.format.InterfaceC0086f
    public final boolean n(z zVar, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.b;
        if (z) {
            zVar.g();
        }
        try {
            for (InterfaceC0086f interfaceC0086f : this.a) {
                if (!interfaceC0086f.n(zVar, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            if (z) {
                zVar.a();
            }
            return true;
        } finally {
            if (z) {
                zVar.a();
            }
        }
    }

    @Override // j$.time.format.InterfaceC0086f
    public final int t(w wVar, CharSequence charSequence, int i) {
        boolean z = this.b;
        InterfaceC0086f[] interfaceC0086fArr = this.a;
        if (z) {
            wVar.r();
            int i2 = i;
            for (InterfaceC0086f interfaceC0086f : interfaceC0086fArr) {
                i2 = interfaceC0086f.t(wVar, charSequence, i2);
                if (i2 < 0) {
                    wVar.f(false);
                    return i;
                }
            }
            wVar.f(true);
            return i2;
        }
        for (InterfaceC0086f interfaceC0086f2 : interfaceC0086fArr) {
            i = interfaceC0086f2.t(wVar, charSequence, i);
            if (i < 0) {
                break;
            }
        }
        return i;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        InterfaceC0086f[] interfaceC0086fArr = this.a;
        if (interfaceC0086fArr != null) {
            boolean z = this.b;
            if (z) {
                str = "[";
            } else {
                str = "(";
            }
            sb.append(str);
            for (InterfaceC0086f interfaceC0086f : interfaceC0086fArr) {
                sb.append(interfaceC0086f);
            }
            if (z) {
                str2 = "]";
            } else {
                str2 = ")";
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    C0085e(InterfaceC0086f[] interfaceC0086fArr, boolean z) {
        this.a = interfaceC0086fArr;
        this.b = z;
    }
}
