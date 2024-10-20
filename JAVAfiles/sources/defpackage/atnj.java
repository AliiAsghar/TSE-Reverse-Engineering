package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atnj {
    public static final atnj a = new atnj(0);
    public static final atnj b = new atnj(1);
    public static final atnj c = new atnj(2);
    public int d;
    public Object e;

    private atnj() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(atmu atmuVar) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        ((List) this.e).add(atmuVar);
    }

    public final String toString() {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return "successful";
                            }
                            StringBuffer stringBuffer = new StringBuffer("DNAME: ");
                            stringBuffer.append(this.e);
                            return stringBuffer.toString();
                        }
                        StringBuffer stringBuffer2 = new StringBuffer("CNAME: ");
                        stringBuffer2.append(this.e);
                        return stringBuffer2.toString();
                    }
                    StringBuffer stringBuffer3 = new StringBuffer("delegation: ");
                    stringBuffer3.append(this.e);
                    return stringBuffer3.toString();
                }
                return "NXRRSET";
            }
            return "NXDOMAIN";
        }
        return "unknown";
    }

    public atnj(int i) {
        this.d = i;
        this.e = null;
    }

    public atnj(int i, atmu atmuVar) {
        this.d = i;
        this.e = atmuVar;
    }
}
