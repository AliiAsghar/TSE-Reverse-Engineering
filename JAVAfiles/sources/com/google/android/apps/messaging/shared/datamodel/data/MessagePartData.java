package com.google.android.apps.messaging.shared.datamodel.data;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import com.google.android.ims.message.rbm.RbmSuggestionResponse;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponse;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseDeserializer;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import defpackage.afvq;
import defpackage.aggp;
import defpackage.aiut;
import defpackage.akto;
import defpackage.ameb;
import defpackage.amoq;
import defpackage.anen;
import defpackage.anfi;
import defpackage.apag;
import defpackage.apba;
import defpackage.apxx;
import defpackage.armf;
import defpackage.gh;
import defpackage.pyz;
import defpackage.qiu;
import defpackage.rah;
import defpackage.rbc;
import defpackage.rha;
import defpackage.rqz;
import defpackage.rtb;
import defpackage.rtd;
import defpackage.rwx;
import defpackage.sbz;
import defpackage.tbg;
import defpackage.tqa;
import defpackage.tqd;
import defpackage.tqi;
import defpackage.tqj;
import defpackage.tql;
import defpackage.trf;
import defpackage.uff;
import defpackage.uzc;
import defpackage.vof;
import defpackage.wfh;
import defpackage.xav;
import defpackage.xnv;
import defpackage.xyl;
import defpackage.xyo;
import defpackage.xze;
import defpackage.ydk;
import defpackage.ydy;
import defpackage.yeb;
import defpackage.yfo;
import defpackage.ymd;
import defpackage.yte;
import defpackage.yyb;
import defpackage.znj;
import defpackage.zxy;
import j$.util.Objects;
import j$.util.Optional;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MessagePartData extends rqz implements MessagePartCoreData {
    public final Context b;
    public final Optional c;
    public tbg d;
    public String e;
    public transient amoq f;
    private final uff g;
    private final armf h;
    private final xav i;
    private final rtb j;
    private final yfo k;
    private final xnv l;
    private final ydk m;
    private final ydy n;
    private final anen o;
    private final boolean p;
    private final boolean q;
    private boolean r;
    private transient afvq s;
    private VmtTable.BindData t;
    private long u;
    private final zxy v;
    private final wfh w;
    public static final xze a = xze.g("BugleDataModel", "MessagePartData");
    public static final Parcelable.Creator<MessagePartCoreData> CREATOR = new rha(6);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rtb dh();
    }

    public MessagePartData(uff uffVar, armf armfVar, xav xavVar, rtb rtbVar, yfo yfoVar, xnv xnvVar, zxy zxyVar, Context context, ydk ydkVar, ydy ydyVar, Optional optional, wfh wfhVar, anen anenVar, Parcel parcel) {
        this.g = uffVar;
        this.h = armfVar;
        this.i = xavVar;
        this.j = rtbVar;
        this.k = yfoVar;
        this.l = xnvVar;
        this.v = zxyVar;
        this.b = context;
        this.m = ydkVar;
        this.n = ydyVar;
        this.c = optional;
        this.w = wfhVar;
        this.o = anenVar;
        this.d = PartsTable.BindData.CREATOR.createFromParcel(parcel).q();
        this.e = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            parcel.readByteArray(bArr);
            try {
                this.f = (amoq) apag.parseFrom(amoq.a, bArr);
            } catch (apba e) {
                a.n("Unable to parse AttachmentInfo", e);
            }
        }
        if (parcel.readInt() > 0) {
            this.t = (VmtTable.BindData) parcel.readParcelable(VmtTable.BindData.class.getClassLoader());
        }
        if (parcel.dataAvail() > 0) {
            this.p = parcel.readInt() == 1;
        } else {
            this.p = false;
        }
        if (parcel.dataAvail() > 0) {
            this.q = parcel.readInt() == 1;
        } else {
            this.q = false;
        }
        this.u = parcel.dataAvail() > 0 ? parcel.readLong() : 0L;
    }

    public static boolean bA(List list) {
        return bQ(list, ameb.RICH_CARD);
    }

    public static boolean bB(List list) {
        return bQ(list, ameb.RICH_CARD_CAROUSEL);
    }

    private final Rect bL(Uri uri, String str) {
        xyl.h();
        if (str == null) {
            a.q("The content type is null");
            return null;
        }
        if (!gh.m(str)) {
            a.q("The content type is not an image: ".concat(str));
            return null;
        }
        if (uri != null && uri != Uri.EMPTY) {
            if (!ydk.w(uri)) {
                a.q("The image uri is not local");
                return null;
            }
            Rect g = this.k.g(uri, str);
            if (g.width() == -1) {
                a.q("The image width is null");
                return null;
            }
            if (g.height() == -1) {
                a.q("The image height is null");
                return null;
            }
            return g;
        }
        a.q("The image uri is null");
        return null;
    }

    private static String bM(tbg tbgVar) {
        if (bP(tbgVar)) {
            boolean bP = bP(tbgVar);
            xyl.k(bP);
            String str = tbgVar.c;
            if (TextUtils.isEmpty(str) || !bP) {
                return null;
            }
            ConversationSuggestionResponse deserializeFromJson = ConversationSuggestionResponseDeserializer.deserializeFromJson(str);
            if (deserializeFromJson != null && !TextUtils.isEmpty(deserializeFromJson.displayText)) {
                return deserializeFromJson.displayText;
            }
            xyo e = a.e();
            e.H("Unable to extract display text from suggestion response:");
            e.H(str);
            e.q();
            return null;
        }
        if (tbgVar.s == 0.0d && tbgVar.t == 0.0d && bO(tbgVar)) {
            return null;
        }
        return tbgVar.c;
    }

    private final void bN() {
        aiut.b();
        Uri uri = this.d.d;
        if (uri != null && ydk.w(uri)) {
            au(ydk.c(this.b, uri));
        }
    }

    private static boolean bO(tbg tbgVar) {
        if (!TextUtils.isEmpty(tbgVar.e) && !gh.w(tbgVar.e) && !bP(tbgVar)) {
            return true;
        }
        return false;
    }

    private static boolean bP(tbg tbgVar) {
        return RbmSuggestionResponse.CONTENT_TYPE.equals(tbgVar.e);
    }

    private static boolean bQ(List list, ameb amebVar) {
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
            if (RbmSpecificMessage.CONTENT_TYPE.equals(messagePartCoreData.U()) && messagePartCoreData.M() == amebVar) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final MessageIdType A() {
        return this.d.b;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final rwx B() {
        Uri uri;
        Uri x;
        String aa;
        String U = U();
        if (t() != null) {
            x = t();
            aa = U();
        } else if (x() != null) {
            x = x();
            aa = aa();
        } else {
            uri = null;
            return new rwx(U, uri);
        }
        String str = aa;
        uri = x;
        U = str;
        return new rwx(U, uri);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [armf, java.lang.Object] */
    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public MessagePartCoreData C() {
        rtb rtbVar = this.j;
        uff uffVar = (uff) rtbVar.a.b();
        uffVar.getClass();
        xav xavVar = (xav) rtbVar.c.b();
        xavVar.getClass();
        rtb rtbVar2 = (rtb) rtbVar.d.b();
        rtbVar2.getClass();
        yfo yfoVar = (yfo) rtbVar.e.b();
        yfoVar.getClass();
        xnv xnvVar = (xnv) rtbVar.f.b();
        xnvVar.getClass();
        zxy zxyVar = (zxy) rtbVar.g.b();
        zxyVar.getClass();
        Context context = (Context) rtbVar.h.b();
        context.getClass();
        ydk ydkVar = (ydk) rtbVar.i.b();
        ydkVar.getClass();
        ydy ydyVar = (ydy) rtbVar.j.b();
        ydyVar.getClass();
        Optional optional = (Optional) ((apxx) rtbVar.k).a;
        wfh wfhVar = (wfh) rtbVar.l.b();
        wfhVar.getClass();
        anen anenVar = (anen) rtbVar.m.b();
        anenVar.getClass();
        MessagePartData messagePartData = new MessagePartData(uffVar, (armf) rtbVar.b, xavVar, rtbVar2, yfoVar, xnvVar, zxyVar, context, ydkVar, ydyVar, optional, wfhVar, anenVar, this);
        if (((Boolean) vof.a.e()).booleanValue()) {
            messagePartData.s = this.s;
            return messagePartData;
        }
        return messagePartData;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final PartsTable.BindData D() {
        return this.d.a();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final VmtTable.BindData E() {
        return this.t;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final tqd F() {
        return this.d.n;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final tqi G() {
        return this.d.Y;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final tqj H() {
        return this.d.T;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final tql I() {
        return this.d.m;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final LocationInformation J() {
        if (!bl()) {
            return null;
        }
        Location location = new Location("Bugler");
        location.setLongitude(this.d.s);
        location.setLatitude(this.d.t);
        LocationInformation locationInformation = new LocationInformation(location, null);
        String str = this.e;
        if (yte.a(str)) {
            locationInformation.a = str;
        }
        return locationInformation;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final afvq K() {
        return this.s;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final aggp L() {
        return (aggp) Objects.requireNonNullElse(this.d.U, aggp.a);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final ameb M() {
        ameb b = ameb.b(this.d.x);
        if (b == null) {
            return ameb.UNKNOWN;
        }
        return b;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final amoq N() {
        return this.f;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String O() {
        return this.d.A;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String P() {
        return this.d.z;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String Q() {
        return this.d.K;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String R() {
        return this.d.B;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String S() {
        return this.d.J;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String T() {
        Resources resources = this.b.getResources();
        if (bz()) {
            return resources.getString(R.string.message_video_content_description);
        }
        if (bk()) {
            int i = this.d.x;
            if (i != 11 && i != 26) {
                if (i != 46 && i != 42 && i != 43) {
                    switch (i) {
                        case 3:
                        case 4:
                        case 5:
                            break;
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            return resources.getString(R.string.message_location_content_description);
                        default:
                            return null;
                    }
                }
                return resources.getString(R.string.message_image_content_description);
            }
            return resources.getString(R.string.message_sticker_content_description);
        }
        return null;
    }

    @Override // defpackage.rwz
    public final String U() {
        return this.d.e;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String V() {
        return this.e;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String W() {
        return this.d.G;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String X() {
        return this.d.H;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String Y() {
        return this.d.S;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String Z() {
        return this.d.a;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final int a() {
        return this.d.y;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aA(afvq afvqVar) {
        this.s = afvqVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aB(Uri uri) {
        this.d.L(uri);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aC(Uri uri) {
        this.d.P(uri);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aD(long j) {
        this.u = j;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aE(tql tqlVar) {
        this.d.Q(tqlVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aF(long j) {
        this.d.W(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aG(String str) {
        if (!TextUtils.isEmpty(str) && bp()) {
            str = str.trim();
        }
        this.d.X(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aH(aggp aggpVar) {
        this.d.ab(aggpVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aI(VmtTable.BindData bindData) {
        this.t = bindData;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aJ(Context context) {
        xyl.k(gh.w(this.d.e));
        tbg tbgVar = this.d;
        tbgVar.X(this.i.a(context, tbgVar.c));
        this.e = bM(this.d);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aK(PartsTable.BindData bindData) {
        this.d.f(bindData.t());
        this.d.g(bindData.u());
        this.d.i(bindData.h());
        this.d.h(bindData.C());
        this.d.G(bindData.F());
        if (anfi.a("bugle.ditto_fix_compressed_blob_id", "bugle")) {
            this.d.p(bindData.w());
        } else {
            this.d.p(bindData.v());
        }
        this.d.r(bindData.k());
        this.d.s(bindData.E());
        this.d.q(bindData.D());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aL(ConversationIdType conversationIdType) {
        this.d.u(conversationIdType);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aM(MessageIdType messageIdType) {
        this.d.J(messageIdType);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aN(String str) {
        boolean z = false;
        if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(Z())) {
            z = true;
        }
        xyl.k(z);
        this.d.B(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aO(MessagePartCoreData messagePartCoreData) {
        this.d.Z(messagePartCoreData.t());
        this.d.P(messagePartCoreData.w());
        this.d.W(messagePartCoreData.p());
        this.d.Q(messagePartCoreData.I());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean aP() {
        if (!this.q) {
            return false;
        }
        if (!bk() && !bz()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean aQ() {
        if (bp() && this.v.o()) {
            Optional a2 = uzc.a(this.e);
            if (a2.isPresent() && yte.a((String) a2.get())) {
                return false;
            }
        }
        return aV();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean aR() {
        return this.d.E;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean aS() {
        return this.d.L;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean aT() {
        if (TextUtils.isEmpty(this.e) || bd()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean aU() {
        if (!TextUtils.isEmpty(X())) {
            return true;
        }
        return false;
    }

    @Override // defpackage.rwz
    public final boolean aV() {
        return bO(this.d);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean aW() {
        return gh.e(this.d.e);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean aX() {
        return this.d.Q;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean aY() {
        if (this.l.f().toEpochMilli() - this.d.F > TimeUnit.DAYS.toMillis(((Integer) trf.d.e()).intValue())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean aZ() {
        return gh.f(this.d.e);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String aa() {
        return this.d.v;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String ab() {
        return this.d.q.toString();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String ac() {
        return this.d.p.toString();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String ad() {
        return this.d.c;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ae() {
        this.d = this.d.a().r();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void af() {
        aiut.b();
        if (aW()) {
            bN();
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ag() {
        aiut.b();
        if (bz()) {
            bN();
        }
    }

    @Override // defpackage.rwz
    public final void ah() {
        xyl.h();
        Rect bL = bL(this.d.d, U());
        if (bL != null) {
            this.d.ac(bL.width());
            this.d.A(bL.height());
        }
    }

    public final void ai() {
        xyl.h();
        Uri uri = this.d.d;
        xyl.h();
        Point point = null;
        if (U() == null) {
            a.q("The content type is null.");
        } else if (bz() && uri != null && ydk.w(uri)) {
            wfh wfhVar = this.w;
            Point point2 = (Point) znj.q((Context) wfhVar.a, uri, new yeb(12), new Point(-1, -1));
            if (point2.x != -1 && point2.y != -1) {
                point = point2;
            }
        }
        if (point != null) {
            this.d.ac(point.x);
            this.d.A(point.y);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aj() {
        Uri y = y();
        if (y != null) {
            qiu.h(this.o.submit(akto.j(new rah(this, y, 14, null))));
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ak() {
        Uri y = y();
        if (y != null) {
            try {
                this.b.getContentResolver().delete(y, null, null);
                this.c.ifPresent(new rbc(9));
            } catch (SecurityException e) {
                a.n("Unable to remove message part data content.", e);
            }
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void al(amoq amoqVar) {
        this.f = amoqVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void am(String str) {
        this.d.g(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void an(long j) {
        this.d.i(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ao(String str) {
        this.d.p(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ap(long j) {
        this.d.r(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aq(byte[] bArr) {
        this.d.s(bArr);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ar(String str) {
        this.d.t(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void as(Uri uri) {
        this.d.Z(uri);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void at(ConversationIdType conversationIdType) {
        this.d.u(conversationIdType);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void au(long j) {
        this.d.v(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void av(String str) {
        this.d.w(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aw(Uri uri) {
        this.d.x(uri);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ax(String str) {
        if (str != null) {
            this.d.y(str);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ay(byte[] bArr) {
        this.d.G(bArr);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void az(tqj tqjVar) {
        this.d.I(tqjVar);
    }

    @Override // defpackage.rwz
    public final int b() {
        return this.d.i;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bC(Uri uri) {
        Uri t = t();
        if (t != null && t.equals(uri)) {
            return true;
        }
        Uri v = v();
        if (v != null && v.equals(uri)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bD(MessagePartCoreData messagePartCoreData) {
        if (!bC(messagePartCoreData.t()) && !bC(messagePartCoreData.v())) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final byte[] bE() {
        return this.d.O;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final byte[] bF() {
        return this.d.N;
    }

    public final InputStream bG(Uri uri) {
        return this.m.k(uri);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void bH() {
        pyz pyzVar = this.d.W;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void bI() {
        this.d.e(true);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final int bJ() {
        if (gh.q(U())) {
            return 2;
        }
        if (gh.f(U())) {
            return 3;
        }
        if (gh.x(U())) {
            return 7;
        }
        if (gh.g(U())) {
            return 4;
        }
        if (gh.r(U())) {
            return 5;
        }
        if (gh.A(U())) {
            return 6;
        }
        return 1;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long bK() {
        InputStream bG;
        xyl.h();
        long l = l();
        if (l > 0) {
            return l;
        }
        Uri v = v();
        if (v != null) {
            try {
                bG = bG(v);
                try {
                    long available = bG.available();
                    bG.close();
                    return available;
                } finally {
                }
            } catch (Exception e) {
                xyo e2 = a.e();
                e2.H("Unable to get original media file size with original uri:");
                e2.H(v);
                e2.r(e);
            }
        }
        Uri t = t();
        if (t != null) {
            try {
                bG = bG(t);
                try {
                    long available2 = bG.available();
                    bG.close();
                    return available2;
                } finally {
                    try {
                        bG.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            } catch (Exception e3) {
                xyo e4 = a.e();
                e4.H("Unable to get original media file size with content uri:");
                e4.H(t);
                e4.r(e3);
            }
        }
        return 0L;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean ba() {
        tqd tqdVar = this.d.n;
        if (tqdVar.f > 0 && tqdVar != tqd.CMS_MEDIA_DOWNLOADED) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bb() {
        if (this.l.f().toEpochMilli() - this.d.M > TimeUnit.DAYS.toMillis(((Integer) trf.d.e()).intValue())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bc() {
        return Objects.equals("custom_sticker", ac());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bd() {
        if (!br() && !bs()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean be() {
        return Objects.equals(this.d.e, "application/x-end-of-emergency-proto");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bf() {
        int i = this.d.x;
        if (i != 11 && i != 26 && i != 34 && i != 35) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bg() {
        return gh.h(this.d.e);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bh() {
        return gh.i(this.d.e);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bi() {
        if (H() == tqj.GOOGLE_PHOTOS_LINK) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bj() {
        return gh.l(this.d.e);
    }

    @Override // defpackage.rwz
    public final boolean bk() {
        return gh.m(this.d.e);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bl() {
        tbg tbgVar = this.d;
        if (tbgVar.t == 0.0d && tbgVar.s == 0.0d) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bm() {
        return gh.p(this.d.e);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bn() {
        return this.d.P;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bo() {
        int i = this.d.x;
        if (i != 16 && i != 17) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bp() {
        return gh.s(this.d.e);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bq() {
        if (this.p) {
            return false;
        }
        if ((!bk() || bl()) && !bz()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean br() {
        if (RbmSpecificMessage.CONTENT_TYPE.equals(this.d.e) && this.d.x == 15) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bs() {
        if (RbmSpecificMessage.CONTENT_TYPE.equals(this.d.e) && this.d.x == 22) {
            return true;
        }
        return false;
    }

    @Override // defpackage.rwz
    public final boolean bt() {
        if (M() == ameb.RICH_CARD_THUMBNAIL) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bu() {
        return bP(this.d);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bv() {
        return gh.u(this.d.e);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bw() {
        return gh.w(this.d.e);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bx() {
        return gh.x(this.d.e);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean by() {
        return gh.y(this.d.e);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, defpackage.rwz
    public final boolean bz() {
        return gh.z(this.d.e);
    }

    @Override // defpackage.rwz
    public final int c() {
        return this.d.h;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long d() {
        return this.d.F;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagePartData)) {
            return false;
        }
        MessagePartData messagePartData = (MessagePartData) obj;
        tbg tbgVar = this.d;
        Uri uri2 = tbgVar.u;
        int i = tbgVar.h;
        tbg tbgVar2 = messagePartData.d;
        if (i == tbgVar2.h && tbgVar.i == tbgVar2.i && tbgVar.b.equals(tbgVar2.b) && TextUtils.equals(this.d.c, messagePartData.d.c) && TextUtils.equals(this.d.e, messagePartData.d.e) && ((uri = this.d.d) != null ? uri.equals(messagePartData.d.d) : messagePartData.d.d == null) && TextUtils.equals(String.valueOf(uri2), String.valueOf(messagePartData.d.u)) && (uri2 != null ? uri2.equals(messagePartData.d.u) : messagePartData.d.u == null) && this.d.Y == messagePartData.d.Y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        tbg tbgVar = this.d;
        int i = ((tbgVar.h + 527) * 31) + tbgVar.i;
        String a2 = tbgVar.b.a();
        int i2 = 0;
        if (a2.isEmpty()) {
            hashCode = 0;
        } else {
            hashCode = a2.hashCode();
        }
        String str = this.d.c;
        int i3 = ((i * 31) + hashCode) * 31;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i4 = i3 + hashCode2;
        String str2 = this.d.e;
        int i5 = i4 * 31;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i6 = i5 + hashCode3;
        Uri uri = this.d.d;
        int i7 = i6 * 31;
        if (uri == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = uri.hashCode();
        }
        int i8 = i7 + hashCode4;
        String str3 = this.d.v;
        int i9 = i8 * 31;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i10 = i9 + hashCode5;
        Uri uri2 = this.d.u;
        int i11 = i10 * 31;
        if (uri2 != null) {
            i2 = uri2.hashCode();
        }
        return i11 + i2;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long j() {
        return this.d.M;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long k() {
        return this.d.I;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long l() {
        return this.d.R;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long m() {
        return this.d.r;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long n() {
        long b;
        long c;
        xyl.h();
        if (aV() && (!((Boolean) vof.a.e()).booleanValue() || !bi())) {
            Uri t = t();
            if (t == null) {
                b = 0;
            } else {
                b = this.m.b(t);
            }
            if (bk()) {
                if (bh()) {
                    ah();
                    if (this.n.a(c(), b())) {
                        return ((float) b) * 0.35f;
                    }
                    return b;
                }
                return 16384L;
            }
            if (aW()) {
                return b;
            }
            if (bz()) {
                if (k() != -1) {
                    c = k();
                } else {
                    c = ydk.c(this.b, t());
                }
                return (c * 4096) / TimeUnit.SECONDS.toMillis(1L);
            }
            if (by()) {
                return b;
            }
            xyo e = a.e();
            e.H("Unknown attachment type:");
            e.H(U());
            e.q();
        }
        return 0L;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long o() {
        return this.u;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long p() {
        return this.d.l;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long q() {
        if (!((wfh) this.h.b()).n()) {
            tbg tbgVar = this.d;
            if (tbgVar.h == -1 || tbgVar.i == -1) {
                if (bk()) {
                    ah();
                } else if (bz()) {
                    ai();
                }
            }
        }
        return this.d.a().r().a().s().longValue();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final ContentValues r() {
        xyl.k(!this.d.b.b());
        ContentValues contentValues = new ContentValues();
        this.d.a().b(contentValues);
        if (this.d.h == -1) {
            contentValues.remove("width");
        }
        if (this.d.i == -1) {
            contentValues.remove("height");
        }
        return contentValues;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final Rect s() {
        return bL(x(), aa());
    }

    @Override // defpackage.rwz
    public final Uri t() {
        Uri uri = this.d.d;
        if (uri != null && !uri.toString().isEmpty()) {
            return this.d.d;
        }
        return null;
    }

    public final String toString() {
        String ad = ad();
        if (aT() && !TextUtils.isEmpty(ad)) {
            return yyb.bh(ad).toString();
        }
        return U() + " (" + String.valueOf(t()) + ")";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final Uri u() {
        return this.d.w;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public Uri v() {
        return this.d.f;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final Uri w() {
        return this.d.k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        xyl.k(!this.r);
        this.d.a().writeToParcel(parcel, i);
        parcel.writeString(this.e);
        amoq amoqVar = this.f;
        if (amoqVar != null) {
            byte[] byteArray = amoqVar.toByteArray();
            parcel.writeInt(byteArray.length);
            parcel.writeByteArray(byteArray);
        } else {
            parcel.writeInt(0);
        }
        if (this.t != null) {
            parcel.writeInt(1);
            parcel.writeParcelable(this.t, i);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeLong(this.u);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final Uri x() {
        return this.d.u;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Uri y() {
        xyl.k(!this.r);
        this.r = true;
        tbg tbgVar = this.d;
        Uri uri = tbgVar.d;
        tbgVar.Z(null);
        this.d.t(null);
        if (!this.g.k(uri) && M() != ameb.RICH_CARD_THUMBNAIL && M() != ameb.RICH_CARD_MEDIA) {
            return null;
        }
        return uri;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final ConversationIdType z() {
        return this.d.o;
    }

    public MessagePartData(uff uffVar, armf armfVar, xav xavVar, rtb rtbVar, yfo yfoVar, xnv xnvVar, zxy zxyVar, Context context, ydk ydkVar, ydy ydyVar, Optional optional, wfh wfhVar, anen anenVar, MessagePartData messagePartData) {
        this.g = uffVar;
        this.h = armfVar;
        this.i = xavVar;
        this.j = rtbVar;
        this.k = yfoVar;
        this.l = xnvVar;
        this.v = zxyVar;
        this.b = context;
        this.m = ydkVar;
        this.n = ydyVar;
        this.c = optional;
        this.w = wfhVar;
        this.o = anenVar;
        this.d = messagePartData.d.a().r();
        this.f = messagePartData.f;
        this.p = messagePartData.p;
        this.q = messagePartData.q;
    }

    @Override // defpackage.rqz
    protected final void g() {
    }

    public MessagePartData(uff uffVar, armf armfVar, xav xavVar, rtb rtbVar, yfo yfoVar, xnv xnvVar, zxy zxyVar, Context context, ydk ydkVar, ydy ydyVar, Optional optional, wfh wfhVar, anen anenVar, rtd rtdVar) {
        tqi tqiVar;
        this.g = uffVar;
        this.h = armfVar;
        this.i = xavVar;
        this.j = rtbVar;
        this.k = yfoVar;
        this.l = xnvVar;
        this.v = zxyVar;
        this.b = context;
        this.m = ydkVar;
        this.n = ydyVar;
        this.c = optional;
        this.w = wfhVar;
        this.o = anenVar;
        tbg b = PartsTable.b();
        this.d = b;
        b.J(rtdVar.a);
        b.X(rtdVar.b);
        b.t(rtdVar.c);
        b.Z(rtdVar.d);
        b.L(rtdVar.e);
        b.x(rtdVar.f);
        b.ac(rtdVar.g);
        b.A(rtdVar.h);
        b.v(rtdVar.i);
        b.P(null);
        b.W(rtdVar.j);
        b.Q(tql.SUCCEEDED);
        b.S(rtdVar.k.a());
        b.U(new tqa(rtdVar.l));
        b.T(new tqa(rtdVar.m));
        b.w(rtdVar.p);
        b.y(rtdVar.q);
        b.j(rtdVar.v);
        b.H(rtdVar.n);
        b.M(rtdVar.r);
        b.I(rtdVar.u);
        b.z(rtdVar.t);
        b.ab(rtdVar.s);
        b.R(rtdVar.z);
        if (ymd.b() && (tqiVar = rtdVar.y) != null) {
            this.d.C(tqiVar);
        }
        LocationInformation locationInformation = rtdVar.o;
        if (locationInformation == null) {
            this.d.F(0.0d);
            this.d.D(0.0d);
        } else {
            this.d.F(locationInformation.c);
            this.d.D(locationInformation.d);
        }
        this.e = bM(this.d);
        this.p = rtdVar.w;
        this.q = rtdVar.x;
    }

    public MessagePartData(uff uffVar, armf armfVar, xav xavVar, rtb rtbVar, yfo yfoVar, xnv xnvVar, zxy zxyVar, Context context, ydk ydkVar, ydy ydyVar, Optional optional, wfh wfhVar, anen anenVar, sbz sbzVar) {
        this.g = uffVar;
        this.h = armfVar;
        this.i = xavVar;
        this.j = rtbVar;
        this.k = yfoVar;
        this.l = xnvVar;
        this.v = zxyVar;
        this.b = context;
        this.m = ydkVar;
        this.n = ydyVar;
        this.c = optional;
        this.w = wfhVar;
        this.o = anenVar;
        tbg b = PartsTable.b();
        this.d = b;
        sbzVar.ao(92, "blob_id");
        b.g(sbzVar.w);
        sbzVar.ao(93, "blob_gaia_email");
        b.f(sbzVar.x);
        sbzVar.ao(97, "blob_upload_permanent_failure");
        b.h(sbzVar.y);
        sbzVar.ao(98, "blob_upload_timestamp");
        b.i(sbzVar.z);
        sbzVar.ao(102, "compressed_blob_id");
        b.p(sbzVar.D);
        sbzVar.ao(104, "compressed_blob_upload_permanent_failure");
        b.q(sbzVar.E);
        sbzVar.ao(105, "compressed_blob_upload_timestamp");
        b.r(sbzVar.F);
        sbzVar.ao(107, "compressed_media_encryption_key");
        b.s(sbzVar.H);
        sbzVar.ao(71, "content_type");
        b.t(sbzVar.e);
        sbzVar.ao(81, "conversation_id");
        b.u(sbzVar.m);
        sbzVar.ao(101, "duration");
        b.v(sbzVar.C);
        sbzVar.ao(99, "expressive_sticker_name");
        b.w(sbzVar.A);
        sbzVar.ao(89, "fallback_uri");
        b.x(sbzVar.u);
        sbzVar.ao(100, "file_name");
        b.y(sbzVar.B);
        sbzVar.ao(75, "height");
        b.A(sbzVar.h);
        sbzVar.ao(67, "_id");
        b.B(sbzVar.a);
        sbzVar.ao(86, "latitude");
        b.D(sbzVar.r);
        sbzVar.ao(85, "longitude");
        b.F(sbzVar.q);
        sbzVar.ao(106, "media_encryption_key");
        b.G(sbzVar.G);
        sbzVar.ao(84, "media_modified_timestamp");
        b.H(sbzVar.p);
        sbzVar.ao(68, "message_id");
        b.J(sbzVar.b);
        sbzVar.ao(72, "original_uri");
        b.L(sbzVar.f);
        sbzVar.ao(77, "output_uri");
        b.P(sbzVar.j);
        sbzVar.ao(88, "preview_content_type");
        b.M(sbzVar.t);
        sbzVar.ao(87, "preview_content_uri");
        b.N(sbzVar.s);
        sbzVar.ao(79, "processing_status");
        b.Q(sbzVar.l);
        sbzVar.ao(90, "source");
        b.S(sbzVar.v);
        sbzVar.ao(83, "sticker_id");
        b.T(sbzVar.o);
        sbzVar.ao(82, "sticker_set_id");
        b.U(sbzVar.n);
        sbzVar.ao(78, "target_size");
        b.W(sbzVar.k);
        sbzVar.ao(69, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        b.X(sbzVar.c);
        sbzVar.ao(76, "timestamp");
        b.Y(sbzVar.i);
        sbzVar.ao(70, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        b.Z(sbzVar.d);
        sbzVar.ao(74, "width");
        b.ac(sbzVar.g);
        sbzVar.ao(110, "file_size_bytes");
        b.z(sbzVar.I);
        sbzVar.ao(116, "rich_card_media_download_failure_reason");
        b.R(sbzVar.J);
        this.p = false;
        this.q = false;
    }

    public MessagePartData(uff uffVar, armf armfVar, xav xavVar, rtb rtbVar, yfo yfoVar, xnv xnvVar, zxy zxyVar, Context context, ydk ydkVar, ydy ydyVar, Optional optional, wfh wfhVar, anen anenVar, PartsTable.BindData bindData) {
        this.g = uffVar;
        this.h = armfVar;
        this.i = xavVar;
        this.j = rtbVar;
        this.k = yfoVar;
        this.l = xnvVar;
        this.v = zxyVar;
        this.b = context;
        this.m = ydkVar;
        this.n = ydyVar;
        this.c = optional;
        this.w = wfhVar;
        this.o = anenVar;
        tbg q = bindData.q();
        this.d = q;
        this.e = bM(q);
        this.p = false;
        this.q = false;
    }
}
