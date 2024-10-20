package defpackage;

import android.content.Context;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aalz extends xzs {
    public static final /* synthetic */ int y = 0;
    final /* synthetic */ ProgressBar a;
    final /* synthetic */ int b;
    final /* synthetic */ TextView c;
    final /* synthetic */ int k;
    final /* synthetic */ String l;
    final /* synthetic */ wyt m;
    final /* synthetic */ Map n;
    final /* synthetic */ int o;
    final /* synthetic */ Random p;
    final /* synthetic */ long q;
    final /* synthetic */ String r;
    final /* synthetic */ String[] s;
    final /* synthetic */ long t;
    final /* synthetic */ Context u;
    final /* synthetic */ Context v;
    final /* synthetic */ int w;
    public final /* synthetic */ aamb x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aalz(aamb aambVar, ProgressBar progressBar, int i, TextView textView, int i2, String str, wyt wytVar, Map map, int i3, Random random, long j, String str2, String[] strArr, long j2, Context context, Context context2, int i4) {
        super("Bugle.Async.Debug.createFakeTelephonyConversations.Duration", null);
        this.a = progressBar;
        this.b = i;
        this.c = textView;
        this.k = i2;
        this.l = str;
        this.m = wytVar;
        this.n = map;
        this.o = i3;
        this.p = random;
        this.q = j;
        this.r = str2;
        this.s = strArr;
        this.t = j2;
        this.u = context;
        this.v = context2;
        this.w = i4;
        this.x = aambVar;
    }

    private final Integer c() {
        return (Integer) this.n.keySet().toArray()[this.p.nextInt(this.n.size())];
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x02f8 A[Catch: all -> 0x0395, TryCatch #1 {all -> 0x0395, blocks: (B:29:0x0162, B:30:0x01bd, B:33:0x01ca, B:35:0x01f7, B:37:0x02a2, B:40:0x02a5, B:42:0x02b7, B:43:0x02f2, B:45:0x02f8, B:47:0x0322, B:49:0x0342, B:50:0x0332, B:56:0x02b0, B:60:0x02d5, B:62:0x02e4, B:71:0x018d, B:81:0x0353, B:83:0x035f, B:85:0x0373, B:86:0x0383), top: B:28:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0340  */
    @Override // defpackage.xzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object a(java.lang.Object[] r60) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aalz.a(java.lang.Object[]):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void onProgressUpdate(Integer... numArr) {
        String str;
        if (numArr != null && numArr.length >= 2 && this.a != null && this.c != null) {
            Integer num = numArr[0];
            int intValue = num.intValue();
            Integer num2 = numArr[1];
            int intValue2 = num2.intValue();
            TextView textView = this.c;
            if (intValue < intValue2) {
                str = String.format(Locale.US, "Progress... %d/%d msgs", num, num2);
            } else {
                str = "Progress... done!";
            }
            textView.setText(str);
            this.a.setProgress(intValue, true);
        }
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        onProgressUpdate(Integer.valueOf(this.b), Integer.valueOf(this.b));
        this.x.k.l("Telephony DB populated. Now syncing...");
        aiut.d(new aafg(this, 15), 5000L);
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        ProgressBar progressBar = this.a;
        if (progressBar != null) {
            progressBar.setMax(this.b);
        }
        onProgressUpdate(0, Integer.valueOf(this.b));
    }
}
