package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apsz extends aptb {
    private final String a;

    public apsz(String str) {
        this.a = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aptb
    public final int a() {
        return c((byte) 96);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int length;
        int length2;
        aptb aptbVar = (aptb) obj;
        if (a() != aptbVar.a()) {
            length2 = a();
            length = aptbVar.a();
        } else {
            String str = this.a;
            String str2 = ((apsz) aptbVar).a;
            if (str.length() != str2.length()) {
                length = str2.length();
                length2 = str.length();
            } else {
                return str.compareTo(str2);
            }
        }
        return length2 - length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((apsz) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), this.a});
    }

    public final String toString() {
        return "\"" + this.a + "\"";
    }
}
