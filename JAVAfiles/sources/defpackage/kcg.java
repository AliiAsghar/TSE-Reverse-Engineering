package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.format.DateUtils;
import android.text.format.Formatter;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcg implements jzy {
    public final Object a;
    public final Object b;
    public final Object c;
    private final Context d;
    private final /* synthetic */ int e;

    public kcg(Context context, lkd lkdVar, Conversation conversation, int i) {
        this.e = i;
        context.getClass();
        lkdVar.getClass();
        conversation.getClass();
        this.d = context;
        this.a = lkdVar;
        this.b = conversation;
        this.c = conversation.b();
    }

    @Override // defpackage.jzy
    public final /* synthetic */ aetv a(kaa kaaVar) {
        String str;
        aeqx aeraVar;
        String formatFileSize;
        if (this.e != 0) {
            kar karVar = (kar) kaaVar;
            myk mykVar = karVar.b;
            miz mizVar = karVar.a;
            Uri d = mykVar.d();
            String l = mykVar.l();
            long k = mykVar.k();
            String j = mykVar.j();
            j.getClass();
            aekf bE = lga.bE(j);
            l.getClass();
            if (k <= 0) {
                formatFileSize = "";
            } else {
                formatFileSize = Formatter.formatFileSize(this.d, k);
            }
            return new aeki(new aejh(bE, l, formatFileSize, karVar.d, null), new aekh((byte[]) null), karVar.d, karVar.c, new kas(this, d, j, l, k), new jkq(this, mizVar, 14));
        }
        kcf kcfVar = (kcf) kaaVar;
        akrh e = aktp.e("GalleryBubbleUiAdapter#createUiData");
        try {
            List<miz> list = kcfVar.a.a;
            ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
            for (miz mizVar2 : list) {
                List list2 = kcfVar.a.a;
                String str2 = kcfVar.c;
                mym e2 = mizVar2.e();
                if (e2 instanceof myn) {
                    String j2 = e2.j();
                    if (gh.m(j2)) {
                        myn mynVar = (myn) e2;
                        Uri d2 = mynVar.d();
                        d2.getClass();
                        aeraVar = new aeqw(d2, String.valueOf(this.d.getString(R.string.photo_item_content_description)).concat(str2), new jda(this, list2, mizVar2, mynVar, 6));
                    } else if (gh.z(j2)) {
                        myn mynVar2 = (myn) e2;
                        Uri d3 = mynVar2.d();
                        d3.getClass();
                        String concat = String.valueOf(this.d.getString(R.string.video_item_content_description)).concat(str2);
                        jda jdaVar = new jda(this, list2, mizVar2, mynVar2, 7);
                        if (mynVar2.h().isPresent()) {
                            str = DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(((Number) mynVar2.h().get()).longValue()));
                        } else {
                            str = null;
                        }
                        aeraVar = new aera(d3, concat, jdaVar, str, new aeqz(null));
                    } else {
                        throw new IllegalStateException("Unknown PhotoVideoContent, content-type: ".concat(String.valueOf(j2)));
                    }
                    arrayList.add(aeraVar);
                } else {
                    throw new IllegalStateException("Content is not photo or video, content-type: ".concat(String.valueOf(e2.j())));
                }
            }
            aeqv aeqvVar = new aeqv(aqjn.as(arrayList), new aequ(null), kcfVar.b, aepz.h);
            armd.i(e, null);
            return aeqvVar;
        } finally {
        }
    }

    public kcg(Context context, kcr kcrVar, ken kenVar, khb khbVar, int i) {
        this.e = i;
        context.getClass();
        kcrVar.getClass();
        kenVar.getClass();
        khbVar.getClass();
        this.d = context;
        this.a = kcrVar;
        this.b = kenVar;
        this.c = khbVar;
    }
}
