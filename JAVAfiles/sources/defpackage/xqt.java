package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HttpContext;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xqt implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ xqt(akul akulVar, akul akulVar2, Object obj, int i) {
        this.d = i;
        this.a = akulVar;
        this.c = akulVar2;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v91, types: [org.apache.http.protocol.HttpContext, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v98, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List, java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v32, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v54, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v73, types: [java.lang.Object, org.apache.http.client.methods.HttpUriRequest] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Integer valueOf;
        Integer valueOf2;
        String str;
        ParticipantsTable.BindData bindData;
        int i;
        boolean z = false;
        r7 = false;
        r7 = false;
        r7 = false;
        r7 = false;
        boolean z2 = false;
        int i2 = 1;
        switch (this.d) {
            case 0:
                return ((xrf) this.a).a((ParticipantsTable.BindData) this.b, (BusinessInfoData) this.c);
            case 1:
                tbt tbtVar = new tbt();
                tbtVar.aj("createMessagePartUpdateBuilder");
                Uri uri = (Uri) this.b;
                tbtVar.s(uri);
                xql xqlVar = (xql) this.c;
                if (!xqlVar.A.a()) {
                    valueOf = Integer.valueOf(a.bp().c());
                    int intValue = valueOf.intValue();
                    valueOf2 = Integer.valueOf(a.bp().c());
                    int intValue2 = valueOf2.intValue();
                    if (intValue2 < 10017) {
                        agnc.t("preview_content_type", intValue2);
                    }
                    if (intValue >= 10017) {
                        agnc.r(tbtVar.a, "preview_content_type", null);
                    }
                    tbtVar.o(null);
                }
                ?? r4 = this.a;
                if (r4.bk()) {
                    Rect g = ((yfo) xqlVar.n.b()).g(uri, r4.U());
                    tbtVar.u(g.width());
                    tbtVar.j(g.height());
                } else if (r4.bz()) {
                    xqk xqkVar = (xqk) new znj(xqlVar.g).p(uri, new xqp(i2), new xqk(new Point(-1, -1), Duration.ZERO));
                    tbtVar.u(xqkVar.a.x);
                    tbtVar.j(xqkVar.a.y);
                    tbtVar.g(xqkVar.b.toMillis());
                } else if (r4.aW()) {
                    tbtVar.g(ydk.c(xqlVar.g, uri));
                }
                return tbtVar;
            case 2:
                return ((xrf) this.a).a((ParticipantsTable.BindData) this.b, (BusinessInfoData) this.c);
            case 3:
                return ((xrm) this.c).n.b(this.a.E(), (Uri) this.b, 1);
            case 4:
                yyb yybVar = (yyb) albo.bQ(this.a);
                yyb yybVar2 = (yyb) albo.bQ(this.c);
                boolean z3 = yybVar2 instanceof xsz;
                Object obj = this.b;
                if (!z3) {
                    if (!(yybVar instanceof xsz)) {
                        ((alwl) ((alwl) ((aluw) ((wyp) obj).e).g()).h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploadProvider", "handleFileAndThumbnailUploads", 169, "TachygramFileUploadProvider.java")).q("File & thumbnail upload both failed. Using file upload failure.");
                        return yybVar2;
                    }
                    return yybVar2;
                }
                qeq qeqVar = ((xsz) yybVar2).a.a;
                if (yybVar instanceof xsz) {
                    qeq qeqVar2 = ((xsz) yybVar).a.a;
                    if ((qeqVar2.b & 2) != 0) {
                        aozy builder = qeqVar.toBuilder();
                        qep qepVar = qeqVar2.d;
                        if (qepVar == null) {
                            qepVar = qep.a;
                        }
                        if (!builder.b.isMutable()) {
                            builder.u();
                        }
                        qeq qeqVar3 = (qeq) builder.b;
                        qepVar.getClass();
                        qeqVar3.d = qepVar;
                        qeqVar3.b |= 2;
                        return new xsz(new xsc((qeq) builder.s()));
                    }
                    return new xsz(new xsc(qeqVar));
                }
                if (yybVar instanceof xta) {
                    ((alwl) ((alwl) ((aluw) ((wyp) obj).e).i()).h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploadProvider", "handleFileAndThumbnailUploads", 188, "TachygramFileUploadProvider.java")).q("File upload succeeded, but thumbnail failed. Dropping thumbnail.");
                    return new xsz(new xsc(qeqVar, Optional.of(((xta) yybVar).a)));
                }
                if (yybVar instanceof xsy) {
                    ((alwl) ((alwl) ((aluw) ((wyp) obj).e).i()).h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploadProvider", "handleFileAndThumbnailUploads", 195, "TachygramFileUploadProvider.java")).q("Unexpected state. Thumbnail should never be cancelled (paused).");
                    return yybVar2;
                }
                throw new IllegalStateException("Unreachable code.");
            case 5:
                wyp wypVar = (wyp) this.c;
                pzw pzwVar = (pzw) wypVar.a.b();
                qep qepVar2 = ((qeq) this.a).d;
                if (qepVar2 == null) {
                    qepVar2 = qep.a;
                }
                pzn pznVar = (pzn) this.b;
                if (!pzwVar.i(pznVar, qepVar2)) {
                    alwl alwlVar = (alwl) ((aluw) wypVar.e).i();
                    alwlVar.X(xod.a, pznVar.a);
                    alwlVar.X(xod.j, pznVar.b);
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploadProvider", "updateDatabaseWithThumbnailAsync", 271, "TachygramFileUploadProvider.java")).q("Failed to update FileTransferTable with thumbnail information.");
                }
                return null;
            case 6:
                Object obj2 = this.a;
                Object obj3 = this.b;
                Object obj4 = this.c;
                try {
                    MessageCoreData q = ((rwd) ((xwj) obj2).e.b()).q((MessageIdType) obj3);
                    if (q == null) {
                        xyo e = xwj.a.e();
                        e.H("Couldn't read message when trying to copy otp code.");
                        e.c((MessageIdType) obj3);
                        e.q();
                    } else {
                        aozy createBuilder = amih.a.createBuilder();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        amih amihVar = (amih) createBuilder.b;
                        amihVar.d = ((aqax) obj4).a();
                        amihVar.b = 2 | amihVar.b;
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        amih amihVar2 = (amih) createBuilder.b;
                        amihVar2.c = a.an(3);
                        amihVar2.b |= 1;
                        ((mho) ((xwj) obj2).h.b()).W(q, (amih) createBuilder.s());
                    }
                } catch (Exception e2) {
                    xyo b = xwj.a.b();
                    b.H("Couldn't log otp copy.");
                    b.c((MessageIdType) obj3);
                    b.z("actionSource", obj4);
                    b.r(e2);
                }
                return null;
            case 7:
                zrz zrzVar = (zrz) this.a;
                MessageCoreData messageCoreData = zrzVar.a;
                Object obj5 = this.b;
                ?? r14 = this.c;
                if (zry.a(messageCoreData)) {
                    zry zryVar = (zry) obj5;
                    xbf xbfVar = zryVar.e;
                    mcr mcrVar = zryVar.g;
                    MessageCoreData messageCoreData2 = zrzVar.a;
                    int i3 = zrzVar.b;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (amoq amoqVar : r14) {
                        int i4 = amoqVar.e;
                        if (i4 != 201 && i4 != 202) {
                            arrayList.add(alog.r(amoqVar));
                        } else {
                            arrayList2.add(amoqVar);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        arrayList.add(arrayList2);
                    }
                    if (messageCoreData2.cI() && messageCoreData2.W().size() > 1) {
                        for (int i5 = 0; i5 < messageCoreData2.W().size(); i5++) {
                            mcrVar.b(((MessagePartCoreData) messageCoreData2.W().get(i5)).o(), lgb.I(messageCoreData2), xbfVar.a(i3).d(), (Iterable) arrayList.get(i5), lgb.h(messageCoreData2));
                        }
                    }
                } else {
                    zry zryVar2 = (zry) obj5;
                    xbf xbfVar2 = zryVar2.e;
                    mcr mcrVar2 = zryVar2.g;
                    lzz lzzVar = zryVar2.h;
                    MessageCoreData messageCoreData3 = zrzVar.a;
                    int i6 = zrzVar.b;
                    if (messageCoreData3.s() == 0) {
                        messageCoreData3.bK(lzzVar.c(messageCoreData3));
                    }
                    mcrVar2.b(messageCoreData3.s(), lgb.I(messageCoreData3), xbfVar2.a(i6).d(), r14, lgb.h(messageCoreData3));
                }
                return new gsw();
            case 8:
                rsa rsaVar = (rsa) albo.bQ(this.a);
                alog alogVar = (alog) albo.bQ(this.c);
                if (!alogVar.isEmpty() && yhx.a) {
                    MessagesTable.BindData bindData2 = (MessagesTable.BindData) alogVar.get(0);
                    if (bindData2.q() == 8 && bindData2.k() != 1 && bindData2.n() == 8) {
                        z2 = true;
                    }
                }
                return new zvo(rsaVar, z2, (sxx) this.b);
            case 9:
                ArrayList f = ((rsa) this.b).f();
                int size = f.size();
                List k = ((zwb) this.c).h.k((ConversationIdType) this.a, f);
                boolean z4 = !k.isEmpty();
                alog n = alog.n(k);
                if (size > 1) {
                    z = true;
                }
                return new zvy(n, z, z4);
            case 10:
                ?? r0 = this.c;
                meo meoVar = (meo) albo.bQ(this.a);
                meo meoVar2 = (meo) albo.bQ(r0);
                new AlertDialog.Builder((Context) this.b).setTitle("Message Status DB Size").setMessage("message_status table:\n" + String.valueOf(meoVar) + "\n\nevents table:\n" + String.valueOf(meoVar2)).setCancelable(true).show();
                return new Object();
            case 11:
                Object obj6 = this.b;
                Locale locale = Locale.US;
                if (obj6 == aalw.SHORT_CODE) {
                    str = "short-code";
                } else {
                    str = "all";
                }
                String format = String.format(locale, "messages-%s.csv", str);
                Object obj7 = this.a;
                aaly aalyVar = (aaly) obj7;
                rwd rwdVar = (rwd) aalyVar.d.b();
                ?? r9 = this.c;
                akrh e3 = aktp.e("MessageDatabaseOperations#getAllMessages");
                try {
                    aiut.b();
                    ArrayList<MessageCoreData> arrayList3 = new ArrayList();
                    sxy d = MessagesTable.d();
                    d.w("getAllMessages");
                    d.h(new atkn((Object) MessagesTable.c.i, true));
                    sxt sxtVar = (sxt) d.b().n();
                    while (sxtVar.moveToNext()) {
                        try {
                            MessageCoreData a = ((tqx) rwdVar.e.b()).a();
                            a.cX(sxtVar);
                            ((rxc) rwdVar.f.b()).b(a, false);
                            rwdVar.G(a);
                            arrayList3.add(a);
                        } finally {
                        }
                    }
                    sxtVar.close();
                    e3.close();
                    Map map = (Map) Collection.EL.stream(((rxq) aalyVar.c.b()).e()).collect(alls.a(new aakq(20), new aand(i2)));
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(uti.e(aalyVar.b, format)));
                    try {
                        outputStreamWriter.write("Sender,Message\n");
                        for (MessageCoreData messageCoreData4 : arrayList3) {
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(new aalx(0));
                            if (!r9.isEmpty()) {
                                arrayList4.addAll(r9);
                            }
                            arrayList4.add(new aalx(1));
                            String am = messageCoreData4.am();
                            if (!TextUtils.isEmpty(am) && (bindData = (ParticipantsTable.BindData) map.get(messageCoreData4.aw())) != null) {
                                String O = bindData.O();
                                if (obj6 != aalw.SHORT_CODE || (msx.i(O) && !((aaly) obj7).e.h(O))) {
                                    Iterator it = arrayList4.iterator();
                                    while (it.hasNext()) {
                                        am = ((aalv) it.next()).a(am);
                                    }
                                    outputStreamWriter.write(String.format("%s,\"%s\"\n", bindData.J(), am));
                                }
                            }
                        }
                        Uri d2 = uti.d(((aaly) obj7).b, format);
                        outputStreamWriter.close();
                        return d2;
                    } finally {
                    }
                } finally {
                }
            case 12:
                advp advpVar = acta.a;
                return ((DefaultHttpClient) this.a).execute((HttpUriRequest) this.b, (HttpContext) this.c);
            case 13:
                boolean isPresent = ((Optional) this.c).isPresent();
                adms admsVar = (adms) this.a;
                boolean isPresent2 = admsVar.l().isPresent();
                Object obj8 = this.b;
                wyp wypVar2 = admsVar.n;
                qjh.l(wypVar2.a, null, new wfa(wypVar2, (adit) obj8, isPresent, isPresent2, null), 3);
                return null;
            case 14:
                return Boolean.valueOf(((aefk) this.c).g((Context) this.b, (abjp) this.a));
            case 15:
                Object obj9 = this.c;
                Object obj10 = this.a;
                aefs aefsVar = (aefs) this.b;
                return aefsVar.b((aefu) obj10, (aday) obj9, aefsVar.e);
            case 16:
                ((aegy) this.b).e.d((String) this.c, (aehn) this.a);
                return null;
            case 17:
                ((aeha) this.b).b.d((String) this.c, (aehn) this.a);
                return null;
            case 18:
                return ((agsw) this.b).c((String) this.c, this.a);
            case 19:
                agxt agxtVar = (agxt) this.c;
                agxtVar.b.set((Paint) this.b);
                agxg agxgVar = agxg.instance;
                ejx a2 = agxgVar.a();
                agxe agxeVar = agxgVar.h;
                agxq agxqVar = (agxq) this.a;
                CharSequence charSequence = agxqVar.b;
                if (a2 != null && agxeVar.a()) {
                    int length = charSequence.length();
                    if (true != agxeVar.d) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    charSequence = ejx.b().d(charSequence, 0, length, length, i);
                }
                if (charSequence instanceof Spanned) {
                    StaticLayout c = agxt.c(charSequence, agxtVar.b);
                    int width = c.getWidth();
                    int height = c.getHeight();
                    int b2 = agxt.b(agxqVar.c, width);
                    int b3 = agxt.b(agxqVar.d, height);
                    float textSize = agxtVar.b.getTextSize();
                    while (textSize > agxtVar.e && (width > b2 || height > b3)) {
                        textSize = agxtVar.a(textSize, Math.min(b2 / width, b3 / height));
                        agxtVar.b.setTextSize(textSize);
                        c = agxt.c(charSequence, agxtVar.b);
                        width = c.getWidth();
                        height = c.getHeight();
                        b2 = agxt.b(agxqVar.c, width);
                        b3 = agxt.b(agxqVar.d, height);
                    }
                    Bitmap a3 = agxtVar.d.a(b2, b3, Bitmap.Config.ARGB_8888);
                    agxtVar.a.setBitmap(a3);
                    c.draw(agxtVar.a);
                    agxtVar.a.setBitmap(null);
                    agxtVar.g = b2;
                    return new agxs(agxqVar, a3);
                }
                agxtVar.b.setTextAlign(Paint.Align.CENTER);
                String charSequence2 = charSequence.toString();
                agxtVar.b.getTextBounds(charSequence2, 0, charSequence2.length(), agxtVar.f);
                Rect rect = agxtVar.f;
                int i7 = agxqVar.c;
                int width2 = rect.width();
                int height2 = rect.height();
                int b4 = agxt.b(i7, width2);
                int b5 = agxt.b(agxqVar.d, height2);
                float textSize2 = agxtVar.b.getTextSize();
                while (textSize2 > agxtVar.e && (width2 > b4 || height2 > b5)) {
                    agxt.d();
                    textSize2 = agxtVar.a(textSize2, Math.min(b4 / width2, b5 / height2));
                    agxtVar.b.setTextSize(textSize2);
                    agxtVar.b.getTextBounds(charSequence2, 0, charSequence2.length(), agxtVar.f);
                    Rect rect2 = agxtVar.f;
                    int i8 = agxqVar.c;
                    width2 = rect2.width();
                    height2 = rect2.height();
                    b4 = agxt.b(i8, width2);
                    b5 = agxt.b(agxqVar.d, height2);
                }
                float exactCenterY = (b5 / 2.0f) - agxtVar.f.exactCenterY();
                agxt.d();
                Bitmap a4 = agxtVar.d.a(b4, b5, Bitmap.Config.ARGB_8888);
                agxtVar.a.setBitmap(a4);
                agxtVar.a.drawText(charSequence2, b4 / 2, (int) exactCenterY, agxtVar.b);
                agxtVar.a.setBitmap(null);
                agxtVar.g = b4;
                return new agxs(agxqVar, a4);
            default:
                ((aixe) this.b).a.execSQL((String) this.a, (Object[]) this.c);
                return null;
        }
    }

    public /* synthetic */ xqt(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ xqt(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ xqt(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ xqt(Object obj, String str, Object obj2, int i) {
        this.d = i;
        this.b = obj;
        this.c = str;
        this.a = obj2;
    }

    public /* synthetic */ xqt(unp unpVar, Object obj, Uri uri, int i) {
        this.d = i;
        this.c = unpVar;
        this.a = obj;
        this.b = uri;
    }
}
