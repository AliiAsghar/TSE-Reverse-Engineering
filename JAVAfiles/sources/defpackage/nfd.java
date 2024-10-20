package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nfd implements alhr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nfd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v24, types: [armf, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        int i = 5;
        int i2 = 2;
        switch (this.b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (ParticipantsTable.BindData bindData : this.a) {
                    bindData.getClass();
                    tbb f = ParticipantsTable.f();
                    f.aj("RecipientContactDataService#updateRecipient");
                    f.M(new nfc(bindData, i2));
                    f.i(bindData.s());
                    f.q(bindData.L());
                    f.o(bindData.K());
                    f.z(bindData.B());
                    f.D(bindData.v());
                    Uri u = bindData.u();
                    valueOf = Integer.valueOf(a.bp().c());
                    int intValue = valueOf.intValue();
                    valueOf2 = Integer.valueOf(a.bp().c());
                    int intValue2 = valueOf2.intValue();
                    if (intValue2 < 59850) {
                        agnc.t("contact_photo_uri", intValue2);
                    }
                    if (intValue >= 59850) {
                        if (u == null) {
                            f.a.putNull("contact_photo_uri");
                        } else {
                            f.a.put("contact_photo_uri", u.toString());
                        }
                    }
                    f.e(bindData.h());
                    f.n(bindData.l());
                    f.C(bindData.C());
                    f.g(bindData.H());
                    f.w(bindData.N());
                    ndp x = bindData.x();
                    valueOf3 = Integer.valueOf(a.bp().c());
                    int intValue3 = valueOf3.intValue();
                    valueOf4 = Integer.valueOf(a.bp().c());
                    int intValue4 = valueOf4.intValue();
                    if (intValue4 < 60070) {
                        agnc.t("contact_metadata", intValue4);
                    }
                    if (intValue3 >= 60070) {
                        if (x == null) {
                            f.a.putNull("contact_metadata");
                        } else {
                            f.a.put("contact_metadata", x.toByteArray());
                        }
                    }
                    f.ah();
                    alog a = f.a().a();
                    a.getClass();
                    ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) aqjn.Z(a);
                    if (bindData2 != null) {
                        arrayList.add(bindData2);
                    }
                }
                return arrayList;
            case 1:
                Stream filter = Collection.EL.stream((Set) this.a.b()).filter(new mmd(11));
                int i3 = alog.d;
                return (alog) filter.collect(alls.a);
            case 2:
                alwo alwoVar = nfq.a;
                return new hgi(((hgi) ((hgi) this.a.b()).a.b()).a, (byte[]) null);
            case 3:
                return "msisdn:".concat(String.valueOf(((ptr) this.a).getString(0)));
            case 4:
                return "last_refresh_timestamp:".concat(String.valueOf(((ptr) this.a).getString(1)));
            case 5:
                return "rcs_capabilities:".concat(String.valueOf(((ptr) this.a).getString(2)));
            case 6:
                qai qaiVar = new qai(qal.a);
                agpw agpwVar = (agpw) this.a;
                qaiVar.k(agpwVar);
                qaiVar.w("file_processing-deleteAndReturnDeletedRows-query");
                alog t = qaiVar.b().t();
                qaf qafVar = new qaf();
                qafVar.a = agpwVar;
                qafVar.f("file_processing-deleteAndReturnDeletedRows-delete");
                qafVar.a().V();
                return t;
            case 7:
                return "processing_id:".concat(String.valueOf(((qae) this.a).getString(0)));
            case 8:
                return "file_type:".concat(String.valueOf(((qae) this.a).getString(1)));
            case 9:
                return "file_uri:".concat(String.valueOf(((qae) this.a).getString(2)));
            case 10:
                return "content_type:".concat(String.valueOf(((qae) this.a).getString(3)));
            case 11:
                return "encryption_metadata:".concat(String.valueOf(((qae) this.a).getString(4)));
            case 12:
                return "transfer_handle:".concat(String.valueOf(((qae) this.a).getString(5)));
            case 13:
                return "upload_result:".concat(String.valueOf(((qae) this.a).getString(6)));
            case 14:
                aiwl a2 = wus.a();
                a2.i(wuk.CMS_SETTINGS);
                a2.k(qid.a);
                a2.h(new qaa(i));
                return ((znj) this.a.b()).ab(a2.f());
            case 15:
                return "_id:".concat(String.valueOf(((qpr) this.a).getString(0)));
            case 16:
                return "matcher_version:".concat(String.valueOf(((qpr) this.a).getString(1)));
            case 17:
                return "destination_key:".concat(String.valueOf(((qpr) this.a).getString(2)));
            case 18:
                return "conversation_id:".concat(String.valueOf(((qpr) this.a).getString(3)));
            case 19:
                return "token:".concat(String.valueOf(((qsv) this.a).getString(0)));
            default:
                return "address:".concat(String.valueOf(((qsv) this.a).getString(1)));
        }
    }
}
