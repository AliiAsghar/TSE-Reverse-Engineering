package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import j$.util.Collection;
import j$.util.Optional;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class haw implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ haw(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v108, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v123, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v30, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Optional of;
        Ringtone ringtone;
        boolean z = true;
        boolean z2 = true;
        byte[] bArr = null;
        int i = 0;
        switch (this.c) {
            case 0:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.a;
                boolean z3 = lottieAnimationView.d;
                Object obj = this.b;
                if (z3) {
                    return hbf.a(lottieAnimationView.getContext(), (String) obj, "asset_".concat(String.valueOf(obj)));
                }
                return hbf.a(lottieAnimationView.getContext(), (String) obj, null);
            case 1:
                evh evhVar = (evh) this.b;
                BitmapFactory.Options options = evhVar.c;
                evn a = ((evm) evhVar.b).a();
                try {
                    a.b(new evl((Uri) this.a, 1, null, Collections.emptyMap(), 0L, 0));
                    byte[] bArr2 = new byte[1024];
                    int i2 = 0;
                    while (i != -1) {
                        int length = bArr2.length;
                        if (i2 == length) {
                            bArr2 = Arrays.copyOf(bArr2, length + length);
                        }
                        i = a.a(bArr2, i2, bArr2.length - i2);
                        if (i != -1) {
                            i2 += i;
                        }
                    }
                    byte[] copyOf = Arrays.copyOf(bArr2, i2);
                    return dzl.f(copyOf, copyOf.length, options, 4096);
                } finally {
                    a.d();
                }
            case 2:
                Object obj2 = this.a;
                Object obj3 = this.b;
                asrk asrkVar = new asrk(asre.b(new ByteArrayInputStream(((String) obj2).getBytes())));
                String[] strArr = hhr.a;
                return hbf.c(new hhs(asrkVar), (String) obj3);
            case 3:
                tqc r = ((rtz) ((BlockAndReportSpamCallbacks) this.b).h.b()).r(ruy.b(((igw) this.a).c));
                if (r == null) {
                    r = tqc.UNARCHIVED;
                }
                return Integer.valueOf(r.h);
            case 4:
                sbd sbdVar = (sbd) ((agoz) this.b).n();
                Object obj4 = this.a;
                try {
                    if (!sbdVar.moveToFirst()) {
                        of = Optional.empty();
                    } else {
                        of = Optional.of(((ijw) obj4).s.c(sbdVar));
                    }
                    sbdVar.close();
                    return of;
                } finally {
                }
            case 5:
                ?? r0 = this.b;
                Object obj5 = this.a;
                try {
                    return ((ikf) obj5).g.f(r0);
                } catch (psx e) {
                    xyo e2 = ikf.a.e();
                    e2.b(((ikf) obj5).j);
                    e2.H("Error getting cached capabilities.");
                    e2.r(e);
                    return Optional.empty();
                }
            case 6:
                return Boolean.valueOf(((irl) this.a).c.d((ConversationIdType) this.b));
            case 7:
                return Boolean.valueOf(((itu) this.a).c.d((ConversationIdType) this.b));
            case 8:
                iyn iynVar = (iyn) this.a;
                if (((ymh) iynVar.r.b()).b(yyb.ae(false, iynVar.x, ((ParticipantsTable.BindData) this.b).M(), ypi.b, true, true, amfe.CONVERSATION_FROM_UNSPAM_ACTION, null, null, 3, 6, 2)) == null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                return new jxv((ParticipantsTable.BindData) albo.bQ(this.a), (BusinessInfoData) albo.bQ(this.b));
            case 10:
                return ((rxq) ((ize) this.a).c.b()).b((String) this.b);
            case 11:
                tby tbyVar = (tby) this.a;
                Uri a2 = ((yhw) tbyVar.m).a(((smr) this.b).Q());
                if (a2 != null && (ringtone = RingtoneManager.getRingtone((Context) tbyVar.p, a2)) != null) {
                    return Optional.of(ringtone.getTitle((Context) tbyVar.p));
                }
                return Optional.empty();
            case 12:
                File file = new File(((Context) ((kkc) this.b).c).getCacheDir().getPath(), "temp_feedback_screenshot_" + String.valueOf(UUID.randomUUID()) + ".png");
                Object obj6 = this.a;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    ((Bitmap) obj6).compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.close();
                    return file;
                } catch (IOException e3) {
                    throw new IllegalStateException("Failed to write screenshot to temp file", e3);
                }
            case 13:
                return ((rxq) ((kws) this.a).c.b()).c((String) this.b);
            case 14:
                return ((znj) ((kws) this.a).e.b()).K((ConversationIdType) this.b);
            case 15:
                return ((lse) this.a).e(this.b);
            case 16:
                Object obj7 = this.a;
                return Boolean.valueOf(((aoia) ((mdy) obj7).c.b()).f(new mau(obj7, this.b, 3, bArr)));
            case 17:
                ?? r02 = this.b;
                alpt alptVar = (alpt) Collection.EL.stream(r02).map(new mlm(4)).filter(new ilu(20)).map(new mlm(true ? 1 : 0)).collect(alls.b);
                if (alptVar.isEmpty()) {
                    return Optional.empty();
                }
                Object obj8 = this.a;
                taz e4 = ParticipantsTable.e();
                e4.g(new ivj(alptVar, obj8, 13, bArr));
                Optional findAny = Collection.EL.stream(e4.b().t()).findAny();
                if (findAny.isEmpty()) {
                    return Optional.empty();
                }
                return findAny.map(new mlm(i)).flatMap(new mjz(r02, 6));
            case 18:
                ((rtz) ((mmg) this.a).c.b()).P(this.b.z().a);
                return true;
            case 19:
                if (!((Boolean) albo.bQ(this.a)).booleanValue() || !((ngh) albo.bQ(this.b)).a()) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            default:
                rtz rtzVar = (rtz) ((mmg) this.a).c.b();
                sng sngVar = new sng();
                sngVar.v(9);
                rtzVar.ah((ConversationIdType) this.b, sngVar);
                return null;
        }
    }

    public /* synthetic */ haw(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
