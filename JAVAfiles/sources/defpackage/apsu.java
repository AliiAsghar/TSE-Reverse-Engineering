package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apsu extends aptb {
    private final boolean a;

    public apsu(boolean z) {
        this.a = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aptb
    public final int a() {
        return c((byte) -32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i;
        aptb aptbVar = (aptb) obj;
        if (a() != aptbVar.a()) {
            return a() - aptbVar.a();
        }
        apsu apsuVar = (apsu) aptbVar;
        int i2 = 20;
        if (true != this.a) {
            i = 20;
        } else {
            i = 21;
        }
        if (true == apsuVar.a) {
            i2 = 21;
        }
        return i - i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.a == ((apsu) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }
}
