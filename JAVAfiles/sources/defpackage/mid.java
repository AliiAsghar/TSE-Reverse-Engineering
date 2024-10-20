package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mid implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ mid(alhr alhrVar, PackageManager packageManager, alpt alptVar, int i, int i2) {
        this.e = i2;
        this.c = alhrVar;
        this.b = packageManager;
        this.d = alptVar;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.concurrent.Future, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ?? r0 = this.c;
                        return new aokn((PackageManager) this.b, (alpt) this.d, (abqq) r0.get()).a(this.a);
                    }
                    abcu abcuVar = (abcu) this.d;
                    xwx xwxVar = (xwx) abcuVar.c.b();
                    int width = abcuVar.m().getWidth();
                    int height = abcuVar.m().getHeight();
                    int i2 = this.a;
                    Object obj = this.c;
                    Context context = (Context) this.b;
                    Bitmap b = xwxVar.b(context, (Uri) obj, width, height, i2, false);
                    if (b == null) {
                        return null;
                    }
                    xwx xwxVar2 = (xwx) abcuVar.c.b();
                    int width2 = b.getWidth() / 4;
                    int height2 = b.getHeight() / 4;
                    Bitmap createBitmap = Bitmap.createBitmap(b.getWidth() + width2 + width2, b.getHeight() + height2 + height2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(context.getColor(R.color.adaptive_background_color_light));
                    canvas.drawBitmap(b, width2, height2, (Paint) null);
                    dyd.e(createBitmap);
                    IconCompat iconCompat = new IconCompat(5);
                    iconCompat.c = createBitmap;
                    return iconCompat;
                }
                Object obj2 = this.d;
                rvv rvvVar = (rvv) ((rwe) obj2).a.b();
                Object obj3 = this.b;
                Object obj4 = this.c;
                int i3 = this.a;
                akrh e = aktp.e("ConversationMessageListDatabaseOperations#loadConversationMessagesAround");
                try {
                    xyl.h();
                    xyl.q(i3);
                    xyo a = rvv.a.a();
                    a.H("ConversationMessageListDatabaseOperations loadConversationMessagesAround starts.");
                    a.q();
                    ibi ibiVar = (ibi) rvvVar.c.b();
                    int i4 = i3 / 2;
                    scu d = scq.d(true, (ConversationIdType) obj3, (MessageIdType) obj4, i4 + 1);
                    d.p(scq.d(false, (ConversationIdType) obj3, (MessageIdType) obj4, i4).b());
                    sbd sbdVar = (sbd) ((say) ibiVar.a).b(true, false, ruy.a, d.b()).b().n();
                    try {
                        List b2 = rvv.b(rvvVar.b, sbdVar);
                        sbdVar.close();
                        e.close();
                        return (List) Collection.EL.stream(b2).map(new rwb(obj2, 12)).collect(Collectors.toCollection(new roi(14)));
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        e.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            Object obj5 = this.c;
            int i5 = this.a;
            Map map = hbf.a;
            Object obj6 = (Context) ((WeakReference) this.d).get();
            Object obj7 = this.b;
            if (obj6 == null) {
                obj6 = obj7;
            }
            return hbf.d((Context) obj6, i5, (String) obj5);
        }
        yiy yiyVar = (yiy) albo.bQ(this.c);
        Boolean bool = (Boolean) albo.bQ(this.d);
        aozy l = ((mie) this.b).l(this.a);
        boolean z = yiyVar.b;
        if (!l.b.isMutable()) {
            l.u();
        }
        amie amieVar = (amie) l.b;
        amie amieVar2 = amie.a;
        amieVar.b |= 1073741824;
        amieVar.G = z;
        boolean z2 = yiyVar.c;
        if (!l.b.isMutable()) {
            l.u();
        }
        amie amieVar3 = (amie) l.b;
        amieVar3.b |= Integer.MIN_VALUE;
        amieVar3.H = z2;
        boolean booleanValue = bool.booleanValue();
        if (!l.b.isMutable()) {
            l.u();
        }
        amie amieVar4 = (amie) l.b;
        amieVar4.c |= 512;
        amieVar4.R = booleanValue;
        if (ier.a()) {
            boolean z3 = yiyVar.d;
            if (!l.b.isMutable()) {
                l.u();
            }
            amie amieVar5 = (amie) l.b;
            amieVar5.c = 1 | amieVar5.c;
            amieVar5.I = z3;
        }
        return (amie) l.s();
    }

    public /* synthetic */ mid(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.e = i2;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
        this.a = i;
    }

    public /* synthetic */ mid(WeakReference weakReference, Context context, int i, String str, int i2) {
        this.e = i2;
        this.d = weakReference;
        this.b = context;
        this.a = i;
        this.c = str;
    }

    public /* synthetic */ mid(mie mieVar, akul akulVar, akul akulVar2, int i, int i2) {
        this.e = i2;
        this.b = mieVar;
        this.c = akulVar;
        this.d = akulVar2;
        this.a = i;
    }
}
