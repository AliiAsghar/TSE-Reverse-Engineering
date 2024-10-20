package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import defpackage.ztr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ztv implements zts {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ztv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [zsq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14, types: [zsq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15, types: [zsq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v16, types: [zsq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v39, types: [zsq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [zsq, java.lang.Object] */
    @Override // defpackage.zts
    public final void a(ztr ztrVar) {
        alog g;
        ihe iheVar;
        amfe amfeVar;
        int i;
        akul h;
        switch (this.b) {
            case 0:
                ?? r9 = this.a;
                ztx ztxVar = (ztx) r9;
                if (!ztxVar.o) {
                    msh mshVar = ztxVar.k;
                    if (mshVar == null) {
                        ztx.a.q("Failed to set display destination because MessagingIdentity was null. Likely add contact banner with no phone number was displayed");
                        return;
                    }
                    if (((Boolean) ztxVar.j.b()).booleanValue()) {
                        ProfilesTable.BindData bindData = ztxVar.m;
                        if (bindData == null) {
                            int i2 = alog.d;
                            g = alsx.a;
                        } else {
                            alob alobVar = new alob();
                            if (!TextUtils.isEmpty(bindData.m()) && !TextUtils.isEmpty(bindData.n())) {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("mimetype", "vnd.android.cursor.item/name");
                                contentValues.put("data2", bindData.m());
                                contentValues.put("data3", bindData.n());
                                alobVar.h(contentValues);
                            } else if (!TextUtils.isEmpty(bindData.l())) {
                                ContentValues contentValues2 = new ContentValues();
                                contentValues2.put("mimetype", "vnd.android.cursor.item/name");
                                contentValues2.put("data2", bindData.l());
                                alobVar.h(contentValues2);
                            }
                            if (ztxVar.n != null) {
                                ContentValues contentValues3 = new ContentValues();
                                contentValues3.put("mimetype", "vnd.android.cursor.item/photo");
                                contentValues3.put("data15", ztxVar.n);
                                alobVar.h(contentValues3);
                            }
                            g = alobVar.g();
                        }
                        ztxVar.e.d(ztxVar.c, mshVar, 8, g);
                    } else {
                        ztxVar.e.j(ztxVar.c, mshVar);
                    }
                    if (((Boolean) zub.b.e()).booleanValue()) {
                        return;
                    }
                    ztxVar.d.aB(4);
                    return;
                }
                ztxVar.h.a(r9, false);
                ztxVar.b();
                return;
            case 1:
                ?? r92 = this.a;
                ((ztx) r92).h.a(r92, false);
                return;
            case 2:
                ztx ztxVar2 = (ztx) this.a;
                ztxVar2.l.getClass();
                igz igzVar = (igz) ztxVar2.f.b();
                ihb a = ihg.a();
                a.d(ihe.SPAM);
                a.e = 1;
                ParticipantsTable.BindData bindData2 = ztxVar2.l;
                bindData2.getClass();
                a.b = bindData2;
                a.c(ztxVar2.i);
                a.c = new igd(2);
                ParticipantsTable.BindData bindData3 = ztxVar2.l;
                bindData3.getClass();
                a.d = hld.j(bindData3);
                a.e();
                a.f = 14;
                igzVar.d(a.a());
                if (((Boolean) zub.b.e()).booleanValue()) {
                    return;
                }
                ztxVar2.d.aB(5);
                return;
            case 3:
                aktp.K(new ztr.a(), ((ztx) this.a).b);
                return;
            case 4:
                ?? r93 = this.a;
                zut zutVar = (zut) r93;
                zutVar.d.a(r93, false);
                zutVar.i();
                return;
            case 5:
                ?? r94 = this.a;
                zuz zuzVar = (zuz) r94;
                zuzVar.d.a(r94, false);
                zuzVar.i();
                return;
            case 6:
                ?? r95 = this.a;
                ((zvf) r95).a.a(r95, false);
                return;
            case 7:
                zvl zvlVar = (zvl) this.a;
                ((zfh) zvlVar.j.b()).g();
                if (yhx.e && zvlVar.j(zvlVar.k)) {
                    zvlVar.i.p(zvlVar.d, zvlVar.k);
                    return;
                } else {
                    zvlVar.i.p(zvlVar.d, zvlVar.l);
                    return;
                }
            case 8:
                ((zvl) this.a).i();
                return;
            case 9:
                zvl zvlVar2 = (zvl) this.a;
                ((zfh) zvlVar2.j.b()).f();
                ((lzv) zvlVar2.h.b()).y(zvlVar2.d, (String) zvl.c.e());
                return;
            case 10:
                ((zvs) this.a).i(4);
                return;
            case 11:
                zvs zvsVar = (zvs) this.a;
                zvsVar.g.getClass();
                igz igzVar2 = (igz) zvsVar.b.b();
                ihb a2 = ihg.a();
                if (zvsVar.f) {
                    iheVar = ihe.GROUP_SPAM;
                } else {
                    iheVar = ihe.SPAM;
                }
                a2.d(iheVar);
                a2.e = 1;
                a2.b = zvsVar.g;
                a2.c(zvsVar.e);
                a2.c = new igd(3);
                a2.d = hld.j(zvsVar.g);
                a2.e();
                a2.f = 11;
                igzVar2.d(a2.a());
                return;
            case 12:
                ((zvs) this.a).i(3);
                return;
            case 13:
                ztrVar.f(false);
                zwi zwiVar = (zwi) this.a;
                ParticipantsTable.BindData bindData4 = zwiVar.k;
                zwiVar.j = bindData4;
                if (zwi.i(bindData4)) {
                    zwt zwtVar = zwiVar.o;
                    h = aktp.ai(new yxs(zwtVar, zwiVar.g, 19), zwtVar.d).h(new zms(6), andi.a);
                } else {
                    ParticipantsTable.BindData bindData5 = zwiVar.k;
                    bindData5.getClass();
                    if (bindData5.R()) {
                        amfeVar = amfe.CONVERSATION_FROM_UNBLOCK_ACTION;
                    } else {
                        amfeVar = amfe.CONVERSATION_FROM_UNSPAM_ACTION;
                    }
                    if (true != bindData5.R()) {
                        i = 13;
                    } else {
                        i = 12;
                    }
                    zwt zwtVar2 = zwiVar.o;
                    ConversationIdType conversationIdType = zwiVar.g;
                    yyz yyzVar = (yyz) zwtVar2.a.b();
                    xxl b = xxm.b();
                    b.d = conversationIdType;
                    b.e = bindData5.M();
                    b.a = false;
                    b.b = false;
                    b.g = amfeVar;
                    b.c(3);
                    b.b(i);
                    h = yyzVar.e(b.a().a()).h(new zms(7), andi.a);
                }
                zwiVar.d.c(ahlp.k(h), zwiVar.l);
                return;
            default:
                ?? r96 = this.a;
                ((zwu) r96).c.a(r96, false);
                return;
        }
    }
}
