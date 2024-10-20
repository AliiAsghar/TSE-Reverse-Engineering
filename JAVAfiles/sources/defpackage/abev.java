package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abev implements ugm {
    private static final alwo b = alwo.o("BugleJobs");
    private final armf c;
    private final armf d;
    private final armf e;

    public abev(armf armfVar, armf armfVar2, armf armfVar3) {
        this.c = armfVar;
        this.e = armfVar3;
        this.d = armfVar2;
    }

    /* JADX WARN: Type inference failed for: r3v16, types: [armf, java.lang.Object] */
    @Override // defpackage.ugm
    public final void a(ugn ugnVar) {
        akrh e = aktp.e("SyncDataToWearableAppHandlerScheduler#queue");
        try {
            int i = ugnVar.b;
            if (i == 2 || i == 1) {
                akrh e2 = aktp.e("SyncDataToWearableAppHandlerScheduler#checkSkipSync");
                try {
                    if (!((aagg) this.e.b()).c()) {
                        alvw n = b.n();
                        n.X(ydl.M, "SyncDataToWearableAppHandlerScheduler");
                        ((alwl) n.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandlerScheduler", "queue", 61, "SyncDataToWearableAppHandlerScheduler.java")).q("Skipping scheduling sync to wear devices.");
                        e2.close();
                    } else {
                        e2.close();
                        alwo alwoVar = b;
                        alwl alwlVar = (alwl) alwoVar.f();
                        alwlVar.X(ydl.M, "SyncDataToWearableAppHandlerScheduler");
                        ((alwl) alwlVar.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandlerScheduler", "queue", 69, "SyncDataToWearableAppHandlerScheduler.java")).q("Queue broadcast wear data work item.");
                        e2 = aktp.e("SyncDataToWearableAppHandlerScheduler#queueWearSync");
                        try {
                            ((zfj) this.c.b()).e(new uta(null, "sync_data_to_wearable_app_dedupe", null, null, null, null));
                            e2.close();
                            if (ugnVar.b == 2) {
                                e2 = aktp.e("SyncDataToWearableAppHandlerScheduler#queueConversationSync");
                                try {
                                    alvw n2 = alwoVar.n();
                                    n2.X(ydl.M, "SyncDataToWearableAppHandlerScheduler");
                                    ((alwl) n2.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandlerScheduler", "queue", 87, "SyncDataToWearableAppHandlerScheduler.java")).q("Queue sync conversation data to wearable work item.");
                                    for (String str : ugnVar.c) {
                                        zfh zfhVar = (zfh) this.d.b();
                                        aozy createBuilder = aber.a.createBuilder();
                                        if (!createBuilder.b.isMutable()) {
                                            createBuilder.u();
                                        }
                                        aber aberVar = (aber) createBuilder.b;
                                        str.getClass();
                                        aberVar.b = str;
                                        ((uof) zfhVar.a.b()).a(upk.b("sync_conversation_data_to_wearable", (aber) createBuilder.s(), new uta(null, str, null, null, null, null)));
                                    }
                                    e2.close();
                                } finally {
                                }
                            }
                        } finally {
                        }
                    }
                } finally {
                    try {
                        e2.close();
                        throw th;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
            e.close();
        } finally {
        }
    }
}
