package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ailv extends aiku implements Cloneable {
    protected String a;
    protected String b;

    public ailv() {
    }

    @Override // defpackage.aiku
    public final String c() {
        String str = this.b;
        if (str != null) {
            return this.a + "@" + str;
        }
        return this.a;
    }

    @Override // defpackage.aiku
    public final Object clone() {
        ailv ailvVar = new ailv();
        ailvVar.a = this.a;
        ailvVar.b = this.b;
        return ailvVar;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj != null) {
            if (obj.getClass().equals(getClass())) {
                ailv ailvVar = (ailv) obj;
                if (this.a.compareTo(ailvVar.a) != 0) {
                    return false;
                }
                String str2 = this.b;
                if (str2 == null && ailvVar.b == null) {
                    return true;
                }
                if (str2 != null && (str = ailvVar.b) != null) {
                    return str2.equalsIgnoreCase(str);
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return 22227650;
    }

    public ailv(String str) {
        int indexOf = str.indexOf(64);
        if (indexOf == -1) {
            this.a = str;
            this.b = null;
            return;
        }
        this.a = str.substring(0, indexOf);
        String substring = str.substring(indexOf + 1, str.length());
        this.b = substring;
        if (this.a == null || substring == null) {
            throw new IllegalArgumentException("CallIdHeader  must be token@token or token");
        }
    }
}
