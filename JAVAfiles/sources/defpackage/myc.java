package defpackage;

import com.google.android.ims.message.rbm.RbmSpecificMessage;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class myc implements myo {
    public final myb a;
    private final myr b;
    private final myr c;
    private final List d;

    public myc(myr myrVar, myr myrVar2, myb mybVar, List list) {
        list.getClass();
        this.b = myrVar;
        this.c = myrVar2;
        this.a = mybVar;
        this.d = list;
        if (myrVar == null && myrVar2 == null && mybVar == null) {
            throw new IllegalStateException("One of title, description, or attachment must be provided.");
        }
    }

    @Override // defpackage.myo
    public final /* synthetic */ myd a() {
        return this.a;
    }

    @Override // defpackage.myo
    public final myr b() {
        return this.c;
    }

    @Override // defpackage.myo
    public final myr c() {
        return this.b;
    }

    @Override // defpackage.myo
    public final List d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myc)) {
            return false;
        }
        myc mycVar = (myc) obj;
        if (d.F(this.b, mycVar.b) && d.F(this.c, mycVar.c) && d.F(this.a, mycVar.a) && d.F(this.d, mycVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        myr myrVar = this.b;
        int i = 0;
        if (myrVar == null) {
            hashCode = 0;
        } else {
            hashCode = myrVar.hashCode();
        }
        myr myrVar2 = this.c;
        if (myrVar2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = myrVar2.hashCode();
        }
        int i2 = hashCode * 31;
        myb mybVar = this.a;
        if (mybVar != null) {
            i = mybVar.hashCode();
        }
        return ((((i2 + hashCode2) * 31) + i) * 31) + this.d.hashCode();
    }

    @Override // defpackage.mym
    public final String j() {
        return RbmSpecificMessage.CONTENT_TYPE;
    }

    public final String toString() {
        return "BugleVerticalRichCardContent(title=" + this.b + ", description=" + this.c + ", attachment=" + this.a + ", suggestions=" + this.d + ")";
    }
}
