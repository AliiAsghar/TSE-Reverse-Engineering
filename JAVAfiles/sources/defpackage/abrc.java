package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.PutDataRequest;
import defpackage.abqy;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abrc<O extends abqy> implements acjj {
    private final abth a;
    public final Context c;
    public final String d;
    public final abqy e;
    public final abrv f;
    public final Looper g;
    public final int h;
    public final abrg i;
    public final abso j;
    public final aaoc k;
    public final zfm l;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        if (r11 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (r12 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e1, code lost:
    
        if (r11 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f3, code lost:
    
        if (r12 != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public abrc(android.content.Context r8, android.app.Activity r9, defpackage.aaoc r10, defpackage.abqy r11, defpackage.abrb r12) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abrc.<init>(android.content.Context, android.app.Activity, aaoc, abqy, abrb):void");
    }

    private final acir a(int i, abtl abtlVar) {
        acit acitVar = new acit();
        int i2 = abtlVar.d;
        abso absoVar = this.j;
        absoVar.d(acitVar, i2, this);
        abrs abrsVar = new abrs(i, abtlVar, acitVar, this.a);
        Handler handler = absoVar.o;
        handler.sendMessage(handler.obtainMessage(4, new apuv((abru) abrsVar, absoVar.k.get(), (abrc) this)));
        return (acir) acitVar.a;
    }

    public static Bitmap k(Activity activity) {
        try {
            return l(activity.getWindow().getDecorView().getRootView());
        } catch (Exception e) {
            Log.w("gF_FeedbackClient", "Get screenshot failed!", e);
            return null;
        }
    }

    public static Bitmap l(View view) {
        Bitmap createBitmap;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Picture picture = new Picture();
                Canvas beginRecording = picture.beginRecording(view.getWidth(), view.getHeight());
                beginRecording.drawRect(brg.a, brg.a, view.getWidth(), view.getHeight(), new Paint());
                view.draw(beginRecording);
                picture.endRecording();
                createBitmap = Bitmap.createBitmap(picture, view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                return createBitmap;
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap2));
            return createBitmap2;
        } catch (Error | Exception e) {
            Log.w("gF_FeedbackClient", "Get screenshot failed!", e);
            return null;
        }
    }

    public static void q(Channel channel) {
        d.aC(channel, "channel must not be null");
    }

    public final absy e(Object obj, String str) {
        return abhb.g(obj, this.g, str);
    }

    public final acir f(abtl abtlVar) {
        return a(2, abtlVar);
    }

    public final acir g(abtl abtlVar) {
        return a(0, abtlVar);
    }

    public final acir h(absw abswVar, int i) {
        acit acitVar = new acit();
        abso absoVar = this.j;
        absoVar.d(acitVar, i, this);
        abrt abrtVar = new abrt(abswVar, acitVar);
        Handler handler = absoVar.o;
        handler.sendMessage(handler.obtainMessage(13, new apuv((abru) abrtVar, absoVar.k.get(), (abrc) this)));
        return (acir) acitVar.a;
    }

    public final acir i(abtl abtlVar) {
        return a(1, abtlVar);
    }

    public final void j(int i, abry abryVar) {
        boolean z = true;
        if (!abryVar.d && !((Boolean) BasePendingResult.b.get()).booleanValue()) {
            z = false;
        }
        abryVar.d = z;
        abso absoVar = this.j;
        absoVar.o.sendMessage(absoVar.o.obtainMessage(4, new apuv((abru) new abrq(i, abryVar), absoVar.k.get(), (abrc) this)));
    }

    public final acir m(FeedbackOptions feedbackOptions) {
        abrg abrgVar = this.i;
        abyh abyhVar = new abyh(abrgVar, feedbackOptions, ((absp) abrgVar).a.c, System.nanoTime());
        abrgVar.b(abyhVar);
        return abhg.o(abyhVar);
    }

    @Override // defpackage.acjj
    public final acir n() {
        ajxp ajxpVar = new ajxp(null);
        ajxpVar.c = new abxb(9);
        ajxpVar.d = new Feature[]{acja.d};
        ajxpVar.b = 4509;
        return g(ajxpVar.b());
    }

    @Override // defpackage.acjj
    public final acir o() {
        ajxp ajxpVar = new ajxp(null);
        ajxpVar.c = new abxb(10);
        ajxpVar.b = 4501;
        return g(ajxpVar.b());
    }

    public final acir p(String str, String str2, byte[] bArr) {
        abrg abrgVar = this.i;
        aclm aclmVar = new aclm(abrgVar, str, str2, bArr);
        abrgVar.b(aclmVar);
        return abhg.n(aclmVar, new acle(5));
    }

    public final void r(abry abryVar) {
        j(2, abryVar);
    }

    public final acir s(Uri uri) {
        return abhg.n(actx.p(this.i, uri, 0), new acle(3));
    }

    public final acir t(PutDataRequest putDataRequest) {
        abrg abrgVar = this.i;
        ackx ackxVar = new ackx(abrgVar, putDataRequest);
        abrgVar.b(ackxVar);
        return abhg.n(ackxVar, new acle(4));
    }

    public final agqc u() {
        Set emptySet;
        GoogleSignInAccount a;
        Account account = null;
        agqc agqcVar = new agqc(null);
        abqy abqyVar = this.e;
        if ((abqyVar instanceof abqw) && (a = ((abqw) abqyVar).a()) != null) {
            String str = a.c;
            if (str != null) {
                account = new Account(str, "com.google");
            }
        } else {
            abqy abqyVar2 = this.e;
            if (abqyVar2 instanceof abqv) {
                account = ((abqv) abqyVar2).a();
            }
        }
        agqcVar.d = account;
        abqy abqyVar3 = this.e;
        if (abqyVar3 instanceof abqw) {
            GoogleSignInAccount a2 = ((abqw) abqyVar3).a();
            if (a2 == null) {
                emptySet = Collections.emptySet();
            } else {
                emptySet = a2.a();
            }
        } else {
            emptySet = Collections.emptySet();
        }
        if (agqcVar.b == null) {
            agqcVar.b = new to();
        }
        ((to) agqcVar.b).addAll(emptySet);
        agqcVar.c = this.c.getClass().getName();
        agqcVar.e = this.c.getPackageName();
        return agqcVar;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.lang.Runnable] */
    public final acir v(addy addyVar) {
        d.aC(((abtd) addyVar.b).a(), "Listener has already been released.");
        acit acitVar = new acit();
        abtd abtdVar = (abtd) addyVar.b;
        int i = abtdVar.d;
        abso absoVar = this.j;
        absoVar.d(acitVar, i, this);
        abrr abrrVar = new abrr(new addy(abtdVar, (ahjj) addyVar.c, addyVar.a, null), acitVar);
        Handler handler = absoVar.o;
        handler.sendMessage(handler.obtainMessage(8, new apuv((abru) abrrVar, absoVar.k.get(), (abrc) this)));
        return (acir) acitVar.a;
    }

    public abrc(Context context, aaoc aaocVar, abqy abqyVar, abrb abrbVar) {
        this(context, null, aaocVar, abqyVar, abrbVar);
    }

    public abrc(Context context) {
        this(context, abyl.b, abqy.q, abrb.a);
        acmn.b(context.getApplicationContext());
    }

    public abrc(Context context, byte[] bArr) {
        this(context, acgt.b, abqy.q, abrb.a);
    }

    public abrc(Context context, abrb abrbVar) {
        this(context, ackk.a, ackj.a, abrbVar);
    }
}
