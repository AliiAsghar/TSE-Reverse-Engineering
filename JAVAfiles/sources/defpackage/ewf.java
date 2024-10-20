package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ewf {
    public int a;

    public final boolean d() {
        return eQ(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
    }

    public void eO() {
        this.a = 0;
    }

    public final void eP(int i) {
        this.a = i | this.a;
    }

    public final boolean eQ(int i) {
        if ((this.a & i) == i) {
            return true;
        }
        return false;
    }

    public final boolean eR() {
        return eQ(4);
    }

    public final boolean f() {
        return eQ(1);
    }

    public final boolean g() {
        return eQ(536870912);
    }
}
