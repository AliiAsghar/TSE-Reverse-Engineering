package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acan implements Runnable {
    private final Context a;
    private final GoogleHelp b;
    private final long c;
    private final /* synthetic */ int d;
    private final abmr e;

    public acan(Context context, GoogleHelp googleHelp, abmr abmrVar, long j, int i) {
        this.d = i;
        this.a = context;
        this.b = googleHelp;
        this.e = abmrVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List singletonList;
        List list;
        if (this.d != 0) {
            Bundle bundle = new Bundle(1);
            try {
                abyt abytVar = new abyt();
                abytVar.c();
                list = this.e.a();
                File cacheDir = this.a.getCacheDir();
                if (list != null && !list.isEmpty() && cacheDir != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((FileTeleporter) it.next()).e = cacheDir;
                    }
                }
                bundle.putString("gms:feedback:async_feedback_psbd_collection_time_ms", String.valueOf(abytVar.a()));
            } catch (Exception e) {
                Log.w("gH_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e);
                bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
                list = null;
            }
            Context context = this.a;
            FeedbackOptions a = FeedbackOptions.a(list);
            acbd acbdVar = new acbd(context);
            GoogleHelp googleHelp = this.b;
            long j = this.c;
            abrg abrgVar = acbdVar.i;
            acas acasVar = new acas(abrgVar, a, bundle, j, googleHelp);
            abrgVar.b(acasVar);
            abhg.o(acasVar);
            return;
        }
        try {
            abyt abytVar2 = new abyt();
            abytVar2.c();
            singletonList = this.e.b();
            if (singletonList == null) {
                singletonList = new ArrayList(1);
            }
            try {
                singletonList.add(Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", String.valueOf(abytVar2.a())));
            } catch (UnsupportedOperationException unused) {
                ArrayList arrayList = new ArrayList(singletonList);
                arrayList.add(Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", String.valueOf(abytVar2.a())));
                singletonList = arrayList;
            }
        } catch (Exception e2) {
            Log.w("gH_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", e2);
            singletonList = Collections.singletonList(Pair.create("gms:feedback:async_feedback_psd_failure", "exception"));
        }
        acbd acbdVar2 = new acbd(this.a);
        GoogleHelp googleHelp2 = this.b;
        long j2 = this.c;
        abrg abrgVar2 = acbdVar2.i;
        acaq acaqVar = new acaq(abrgVar2, abmr.o(singletonList), j2, googleHelp2);
        abrgVar2.b(acaqVar);
        abhg.o(acaqVar);
    }
}
