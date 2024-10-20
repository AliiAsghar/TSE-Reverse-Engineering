package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.gms.cloudmessaging.CloudMessage;
import j$.util.Optional;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class abpd implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ abpd(abpe abpeVar, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult, int i) {
        this.f = i;
        this.b = abpeVar;
        this.c = intent;
        this.d = context;
        this.a = z;
        this.e = pendingResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // java.lang.Runnable
    public final void run() {
        Intent intent;
        int i;
        if (this.f != 0) {
            Object obj = this.b;
            ((rjq) this.d).b(this.c, (Uri) this.e, this.a, (Optional) obj);
            return;
        }
        Object obj2 = this.e;
        Object obj3 = this.c;
        try {
            Parcelable parcelableExtra = ((Intent) obj3).getParcelableExtra("wrapped_intent");
            Executor executor = null;
            if (parcelableExtra instanceof Intent) {
                intent = (Intent) parcelableExtra;
            } else {
                intent = null;
            }
            Object obj4 = this.d;
            Object obj5 = this.b;
            if (intent != null) {
                i = ((abpe) obj5).c(intent);
            } else if (((Intent) obj3).getExtras() == null) {
                i = 500;
            } else {
                CloudMessage cloudMessage = new CloudMessage((Intent) obj3);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (abpe.class) {
                    SoftReference softReference = abpe.a;
                    if (softReference != null) {
                        executor = (Executor) softReference.get();
                    }
                    if (executor == null) {
                        abgj abgjVar = accz.a;
                        executor = abgj.q(new aglj("pscm-ack-executor", 1));
                        abpe.a = new SoftReference(executor);
                    }
                }
                executor.execute(new aauq(obj4, cloudMessage, countDownLatch, 7, (byte[]) null));
                int a = ((abpe) obj5).a((Context) obj4, cloudMessage);
                try {
                    if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                        Log.w("CloudMessagingReceiver", "Message ack timed out");
                    }
                } catch (InterruptedException e) {
                    Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e.toString()));
                }
                i = a;
            }
            if (this.a && obj2 != null) {
                ((BroadcastReceiver.PendingResult) obj2).setResultCode(i);
            }
        } finally {
            if (obj2 != null) {
                ((BroadcastReceiver.PendingResult) obj2).finish();
            }
        }
    }

    public /* synthetic */ abpd(rjq rjqVar, MessageCoreData messageCoreData, Uri uri, boolean z, Optional optional, int i) {
        this.f = i;
        this.d = rjqVar;
        this.c = messageCoreData;
        this.e = uri;
        this.a = z;
        this.b = optional;
    }
}
