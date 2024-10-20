package defpackage;

import android.animation.ValueAnimator;
import android.media.AudioTrack;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.work.impl.WorkDatabase;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eex implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ eex(AudioTrack audioTrack, qdq qdqVar, Handler handler, dzo dzoVar, int i) {
        this.e = i;
        this.d = audioTrack;
        this.b = qdqVar;
        this.a = handler;
        this.c = dzoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0245  */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v115, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, android.view.MenuItem] */
    /* JADX WARN: Type inference failed for: r0v90, types: [uuf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v103, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r3v101, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v85, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v88, types: [armf, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 2222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eex.run():void");
    }

    public eex(View view, mka mkaVar, eet eetVar, ValueAnimator valueAnimator, int i) {
        this.e = i;
        this.a = view;
        this.b = mkaVar;
        this.c = eetVar;
        this.d = valueAnimator;
    }

    public eex(ic icVar, apuv apuvVar, MenuItem menuItem, ij ijVar, int i) {
        this.e = i;
        this.d = icVar;
        this.a = apuvVar;
        this.b = menuItem;
        this.c = ijVar;
    }

    public /* synthetic */ eex(irw irwVar, ViewPropertyAnimator viewPropertyAnimator, View view, oo ooVar, int i) {
        this.e = i;
        this.b = irwVar;
        this.c = viewPropertyAnimator;
        this.a = view;
        this.d = ooVar;
    }

    public /* synthetic */ eex(Object obj, Object obj2, Object obj3, Enum r4, int i) {
        this.e = i;
        this.d = obj;
        this.a = obj2;
        this.c = obj3;
        this.b = r4;
    }

    public /* synthetic */ eex(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.a = obj;
        this.d = obj2;
        this.c = obj3;
        this.b = obj4;
    }

    public /* synthetic */ eex(Object obj, Object obj2, Object obj3, Object obj4, int i, byte[] bArr) {
        this.e = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ eex(String str, arqg arqgVar, eny enyVar, dtq dtqVar, int i) {
        this.e = i;
        this.c = str;
        this.b = arqgVar;
        this.a = enyVar;
        this.d = dtqVar;
    }

    public /* synthetic */ eex(List list, gyg gygVar, gsb gsbVar, WorkDatabase workDatabase, int i) {
        this.e = i;
        this.b = list;
        this.c = gygVar;
        this.d = gsbVar;
        this.a = workDatabase;
    }

    public /* synthetic */ eex(mic micVar, String str, String str2, tqr tqrVar, int i) {
        this.e = i;
        this.d = micVar;
        this.c = str;
        this.b = str2;
        this.a = tqrVar;
    }

    public /* synthetic */ eex(qau qauVar, ConversationIdType conversationIdType, qem qemVar, qei qeiVar, int i) {
        this.e = i;
        this.d = qauVar;
        this.b = conversationIdType;
        this.c = qemVar;
        this.a = qeiVar;
    }

    public /* synthetic */ eex(ruq ruqVar, MessageIdType messageIdType, ConversationIdType conversationIdType, tqc tqcVar, int i) {
        this.e = i;
        this.d = ruqVar;
        this.c = messageIdType;
        this.a = conversationIdType;
        this.b = tqcVar;
    }

    public /* synthetic */ eex(uhg uhgVar, ParticipantsTable.BindData bindData, tbb tbbVar, String str, int i) {
        this.e = i;
        this.c = uhgVar;
        this.d = bindData;
        this.a = tbbVar;
        this.b = str;
    }
}
