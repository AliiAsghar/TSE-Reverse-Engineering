package defpackage;

import com.android.vcard.VCardConstants;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxo implements myo {
    public final mxn a;
    public final int b;
    private final myr c;
    private final myr d;
    private final List e;

    public mxo(myr myrVar, myr myrVar2, mxn mxnVar, List list, int i) {
        list.getClass();
        this.c = myrVar;
        this.d = myrVar2;
        this.a = mxnVar;
        this.e = list;
        this.b = i;
        if (myrVar == null && myrVar2 == null) {
            throw new IllegalStateException("One of title or description must be provided.");
        }
    }

    @Override // defpackage.myo
    public final /* synthetic */ myd a() {
        return this.a;
    }

    @Override // defpackage.myo
    public final myr b() {
        return this.d;
    }

    @Override // defpackage.myo
    public final myr c() {
        return this.c;
    }

    @Override // defpackage.myo
    public final List d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxo)) {
            return false;
        }
        mxo mxoVar = (mxo) obj;
        if (d.F(this.c, mxoVar.c) && d.F(this.d, mxoVar.d) && d.F(this.a, mxoVar.a) && d.F(this.e, mxoVar.e) && this.b == mxoVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        myr myrVar = this.c;
        int i = 0;
        if (myrVar == null) {
            hashCode = 0;
        } else {
            hashCode = myrVar.hashCode();
        }
        myr myrVar2 = this.d;
        if (myrVar2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = myrVar2.hashCode();
        }
        int i2 = hashCode * 31;
        mxn mxnVar = this.a;
        if (mxnVar != null) {
            i = mxnVar.hashCode();
        }
        int hashCode3 = (((((i2 + hashCode2) * 31) + i) * 31) + this.e.hashCode()) * 31;
        int i3 = this.b;
        a.bm(i3);
        return hashCode3 + i3;
    }

    @Override // defpackage.mym
    public final String j() {
        return RbmSpecificMessage.CONTENT_TYPE;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BugleHorizontalRichCardContent(title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", attachment=");
        sb.append(this.a);
        sb.append(", suggestions=");
        sb.append(this.e);
        sb.append(", alignment=");
        if (this.b != 1) {
            str = VCardConstants.PROPERTY_END;
        } else {
            str = "START";
        }
        sb.append((Object) str);
        sb.append(")");
        return sb.toString();
    }
}
