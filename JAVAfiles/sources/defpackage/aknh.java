package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aknh<T> extends BroadcastReceiver {
    public static final alvi a = alvi.m("com/google/apps/tiktok/receiver/IntentFilterAcledReceiver");
    public aegu b;
    public long c;
    public aneo d;
    private final Class e;
    private armf f;

    /* JADX INFO: Access modifiers changed from: protected */
    public aknh(Class cls) {
        this.e = cls;
    }

    public static final void b(ListenableFuture listenableFuture) {
        if (!listenableFuture.isCancelled()) {
            aiut.e(akto.j(new akhg(listenableFuture, 12)));
        }
    }

    private final ListenableFuture c(Context context, Intent intent, akrl akrlVar) {
        ListenableFuture bH;
        akrh e = aktp.e("getEntryPoint");
        try {
            try {
                bH = albo.bI(akec.w(context, this.e));
            } catch (IllegalStateException e2) {
                bH = albo.bH(new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e2));
            }
            e.b(bH);
            e.close();
            getResultCode();
            akrh f = aktp.f("handleBroadcast", akrlVar);
            try {
                Collection.EL.forEach((Set) ((apxx) this.f).a, new ajql(2));
                ListenableFuture g = ancj.g(bH, akto.d(new ahsi(this, intent, 17, null)), andi.a);
                f.b(g);
                f.close();
                if (!g.isDone()) {
                    BroadcastReceiver.PendingResult goAsync = goAsync();
                    goAsync.getClass();
                    g.c(akto.j(new akhg(goAsync, 13)), andi.a);
                }
                return g;
            } catch (Throwable th) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                e.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public ansy a(Object obj) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e1, code lost:
    
        if (r1.activityInfo.exported != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e5, code lost:
    
        r0 = r10.getPackageManager();
        r6 = r11.setComponent(null).cloneFilter();
        r6.setSelector(null);
        r6.setPackage(r10.getPackageName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ff, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 29) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0101, code lost:
    
        r7 = 269221952;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0108, code lost:
    
        r0 = r0.queryBroadcastReceivers(r6, r7).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0114, code lost:
    
        if (r0.hasNext() == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0116, code lost:
    
        r6 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0124, code lost:
    
        if (r3.equals(r6.activityInfo.name) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0126, code lost:
    
        r0 = r6.filter;
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0133, code lost:
    
        if (r0.matchAction(r11.getAction()) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013d, code lost:
    
        if (r0.matchCategories(r11.getCategories()) != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013f, code lost:
    
        r3 = r11.getType();
        r4 = r0.matchData(r3, r11.getScheme(), r11.getData());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0150, code lost:
    
        if (r4 == (-2)) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0153, code lost:
    
        if (r4 != (-1)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0155, code lost:
    
        if (r3 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0157, code lost:
    
        r0 = r0.matchData(r11.resolveType(r10), r11.getScheme(), r11.getData());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0167, code lost:
    
        if (r0 == (-1)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0169, code lost:
    
        if (r0 == (-2)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0171, code lost:
    
        throw new defpackage.aipy(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0177, code lost:
    
        throw new defpackage.aipy(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x017d, code lost:
    
        throw new defpackage.aipy(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0183, code lost:
    
        throw new defpackage.aipy(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0189, code lost:
    
        throw new defpackage.aipy(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x018a, code lost:
    
        r0 = r10.getPackageManager();
        r6 = defpackage.aipz.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0190, code lost:
    
        monitor-enter(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0193, code lost:
    
        if (defpackage.aipz.b != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0195, code lost:
    
        r7 = new android.content.Intent();
        r7.setPackage(r10.getPackageName());
        defpackage.aipz.b = r0.queryBroadcastReceivers(r7, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a7, code lost:
    
        r0 = defpackage.aipz.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a9, code lost:
    
        monitor-exit(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01aa, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b2, code lost:
    
        if (r0.hasNext() == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c2, code lost:
    
        if (r3.equals(((android.content.pm.ResolveInfo) r0.next()).activityInfo.name) != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ca, code lost:
    
        throw new defpackage.aipy(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0105, code lost:
    
        r7 = 786496;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r10, android.content.Intent r11) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aknh.onReceive(android.content.Context, android.content.Intent):void");
    }
}
