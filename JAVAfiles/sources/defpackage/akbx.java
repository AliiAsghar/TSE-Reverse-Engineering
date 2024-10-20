package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akbx extends arpw implements arqv {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akbx(arpe arpeVar, ahiy ahiyVar, Uri uri, ContentValues contentValues, int i) {
        super(2, arpeVar);
        this.e = i;
        this.c = ahiyVar;
        this.a = uri;
        this.b = contentValues;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((akbx) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((akbx) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        if (this.e != 0) {
            aqil.P(obj);
            arwe arweVar = (arwe) this.d;
            arwl I = arrn.I(arweVar, null, null, new xgk((aair) this.a, (MessageCoreData) this.b, (arpe) null, 17), 3);
            arwl I2 = arrn.I(arweVar, null, null, new yhj((aair) this.a, (MessageCoreData) this.b, (arpe) null, 4), 3);
            arwl I3 = arrn.I(arweVar, null, null, new yhj((aair) this.a, (MessageCoreData) this.b, (arpe) null, 5, (byte[]) null), 3);
            arwl I4 = arrn.I(arweVar, null, null, new xgk((aair) this.a, I2, (arpe) null, 19, (byte[]) null), 3);
            return new you(this.b, I, I2, I3, I4, arrn.I(arweVar, null, null, new xgk((aair) this.a, I4, (arpe) null, 18), 3), new ikv((aair) this.a, (MessageCoreData) this.b, (arpe) null, 5), (Integer) this.c);
        }
        aqil.P(obj);
        Object obj2 = this.b;
        Uri uri = (Uri) this.a;
        return (Uri) ((ansy) ((ahiy) this.c).a).p(uri, new akce(uri, (ContentValues) obj2, 1));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        if (this.e != 0) {
            ?? r2 = this.b;
            Object obj2 = this.c;
            akbx akbxVar = new akbx((MessageCoreData) r2, (Integer) obj2, (aair) this.a, arpeVar, 1);
            akbxVar.d = obj;
            return akbxVar;
        }
        Object obj3 = this.c;
        ahiy ahiyVar = (ahiy) obj3;
        akbx akbxVar2 = new akbx(arpeVar, ahiyVar, (Uri) this.a, (ContentValues) this.b, 0);
        akbxVar2.d = obj;
        return akbxVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akbx(MessageCoreData messageCoreData, Integer num, aair aairVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.b = messageCoreData;
        this.c = num;
        this.a = aairVar;
    }
}
