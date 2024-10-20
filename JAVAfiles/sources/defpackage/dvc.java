package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvc extends duw {
    public dvc(char[] cArr) {
        super(cArr);
    }

    public static dvc a(String str) {
        dvc dvcVar = new dvc(str.toCharArray());
        dvcVar.z();
        dvcVar.x(str.length() - 1);
        return dvcVar;
    }

    @Override // defpackage.duw
    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof dvc) && v().equals(((dvc) obj).v())) {
                return true;
            }
            return super.equals(obj);
        }
        return true;
    }
}
