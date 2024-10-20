package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mtp implements algk {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ mtp(mic micVar, MessageCoreData messageCoreData, int i, int i2, amgl amglVar, int i3) {
        this.f = i3;
        this.c = micVar;
        this.e = messageCoreData;
        this.a = i;
        this.b = i2;
        this.d = amglVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        boolean z;
        if (this.f != 0) {
            Object obj2 = this.d;
            int i = this.b;
            ((mic) this.c).bn(this.e, this.a, i, (amgl) obj2);
            return null;
        }
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        int i2 = this.a;
        if (i2 >= intValue) {
            z = true;
        } else {
            z = false;
        }
        mtr.f(z, "underlying data changed between queries");
        int intValue2 = i2 - num.intValue();
        Object obj3 = this.c;
        Object obj4 = this.d;
        int i3 = this.b;
        alog alogVar = (alog) obj4;
        mtr mtrVar = (mtr) obj3;
        alog a = mtrVar.a(alogVar, intValue2, i3 + intValue2);
        int size = alogVar.size() - a.size();
        nae naeVar = (nae) this.e;
        nae naeVar2 = new nae(a, naeVar.b, naeVar.c + size, mtrVar.b);
        mtrVar.c(naeVar2, i3);
        return naeVar2;
    }

    public /* synthetic */ mtp(mtr mtrVar, int i, alog alogVar, int i2, nae naeVar, int i3) {
        this.f = i3;
        this.c = mtrVar;
        this.a = i;
        this.d = alogVar;
        this.b = i2;
        this.e = naeVar;
    }
}
