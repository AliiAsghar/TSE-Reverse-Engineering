package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.resizing.ResizingService;
import com.google.android.apps.messaging.shared.datamodel.resizing.ResizingServiceAndroidV;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uih {
    private static final xze b = xze.g("BugleResizing", "ResizingManager");
    public final Context a;
    private final via c;
    private final uie d;
    private final armf e;
    private volatile uig f = null;
    private int g = 0;
    private int h = 0;
    private final HashSet i = new HashSet();
    private ConversationId j = InvalidConversationId.a;
    private final uqg k;
    private final zai l;

    public uih(Context context, uqg uqgVar, zai zaiVar, uie uieVar, via viaVar, armf armfVar) {
        this.a = context;
        this.k = uqgVar;
        this.l = zaiVar;
        this.c = viaVar;
        this.d = uieVar;
        this.e = armfVar;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [armf, java.lang.Object] */
    public final uig a() {
        xyo a = b.a();
        a.z("finishedJobs", this.i);
        a.q();
        tbs d = PartsTable.d();
        d.w("getAllPartsThatNeedProcessing");
        d.q();
        d.g(new uid(2));
        int i = 0;
        d.h(new atkn((Object) PartsTable.d.j, false));
        tbn tbnVar = (tbn) d.b().n();
        uie uieVar = this.d;
        try {
            ArrayList<MessagePartCoreData> arrayList = new ArrayList(tbnVar.getCount());
            while (tbnVar.moveToNext()) {
                arrayList.add(((rtb) uieVar.a).d(tbnVar));
            }
            tbnVar.close();
            uig uigVar = null;
            MessagePartCoreData messagePartCoreData = null;
            int i2 = 0;
            for (MessagePartCoreData messagePartCoreData2 : arrayList) {
                if (!this.i.contains(messagePartCoreData2.w())) {
                    if (messagePartCoreData == null) {
                        messagePartCoreData = messagePartCoreData2;
                    }
                    if (messagePartCoreData2.bk()) {
                        i++;
                    } else if (messagePartCoreData2.bz()) {
                        i2++;
                    }
                }
            }
            this.g = i;
            this.h = i2;
            this.c.r(this.j, i, i2);
            if (messagePartCoreData == null) {
                return null;
            }
            if (messagePartCoreData.bk()) {
                uqg uqgVar = this.k;
                Context context = (Context) uqgVar.d.b();
                context.getClass();
                ((uie) uqgVar.a.b()).getClass();
                rgm rgmVar = (rgm) uqgVar.b.b();
                rgmVar.getClass();
                uigVar = new uic(context, uqgVar.c, rgmVar, messagePartCoreData, this);
            } else if (messagePartCoreData.bz()) {
                zai zaiVar = this.l;
                Context context2 = (Context) zaiVar.b.b();
                context2.getClass();
                mce mceVar = (mce) zaiVar.e.b();
                mceVar.getClass();
                yhf yhfVar = (yhf) zaiVar.a.b();
                yhfVar.getClass();
                ((uie) zaiVar.c.b()).getClass();
                rgm rgmVar2 = (rgm) zaiVar.d.b();
                rgmVar2.getClass();
                uigVar = new uij(context2, mceVar, yhfVar, rgmVar2, messagePartCoreData, this);
            } else {
                xyo e = b.e();
                e.H("Unsupported type.");
                e.z("contentType", messagePartCoreData.U());
                e.q();
                ((mbl) this.e.b()).c("Bugle.Media.Attachment.Resize.UnsupportedType.Count");
            }
            this.f = uigVar;
            return this.f;
        } catch (Throwable th) {
            try {
                tbnVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(Iterable iterable, ConversationId conversationId) {
        Intent putExtra;
        akrh e;
        akrh e2 = aktp.e("ResizingManager#attachmentsChanged");
        try {
            xyl.h();
            if (iterable != null && iterable.iterator().hasNext() && !(conversationId instanceof InvalidConversationId)) {
                this.j = conversationId;
            }
            uig uigVar = this.f;
            int i = 0;
            if (uigVar != null) {
                e = aktp.e("ResizingManager::maybeCancel");
                try {
                    xyl.h();
                    if (!uigVar.f) {
                        Uri uri = uigVar.b;
                        Uri uri2 = uigVar.c;
                        tbs d = PartsTable.d();
                        d.w("isAttachmentNeedsProcessing");
                        d.g(new tux(uri, uri2, 8));
                        d.h(new atkn((Object) PartsTable.d.j, false));
                        d.u(1);
                        d.e(new uid(3));
                        tbn tbnVar = (tbn) d.b().n();
                        try {
                            boolean moveToNext = tbnVar.moveToNext();
                            tbnVar.close();
                            if (!moveToNext) {
                                xyo a = uig.a.a();
                                a.H("Aborting");
                                a.H(uigVar.getClass().getName());
                                a.z("contentUri", uigVar.c);
                                a.z("outputUri", uigVar.b);
                                a.y("maxFileSize", uigVar.d);
                                a.q();
                                uigVar.a();
                            }
                        } finally {
                        }
                    }
                    e.close();
                } finally {
                }
            }
            if (iterable != null) {
                if (Build.VERSION.SDK_INT >= 35) {
                    putExtra = new Intent(this.a, (Class<?>) ResizingServiceAndroidV.class).setFlags(1).putExtra("op", 0);
                } else {
                    putExtra = new Intent(this.a, (Class<?>) ResizingService.class).setFlags(1).putExtra("op", 0);
                }
                Iterator it = iterable.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
                    if (messagePartCoreData.bq() && messagePartCoreData.w() != null) {
                        putExtra.setData(messagePartCoreData.t());
                        e = aktp.e("ResizingManager::startForegroundService");
                        try {
                            uwf.a(new wnd(this, putExtra, 1));
                            e.close();
                            if (messagePartCoreData.bk()) {
                                i++;
                            } else if (messagePartCoreData.bz()) {
                                i2++;
                            }
                            xyo a2 = b.a();
                            a2.H("start resizing.");
                            a2.z("contentUri", messagePartCoreData.t());
                            a2.q();
                        } finally {
                        }
                    }
                }
                if (i > 0 || i2 > 0) {
                    int i3 = this.g + i;
                    this.g = i3;
                    int i4 = this.h + i2;
                    this.h = i4;
                    this.c.r(this.j, i3, i4);
                }
            }
            e2.close();
        } catch (Throwable th) {
            try {
                e2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c(Uri uri) {
        this.i.add(uri);
    }
}
