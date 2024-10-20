package defpackage;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afov extends arpw implements arqv {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afov(afox afoxVar, List list, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = afoxVar;
        this.b = list;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return ((afov) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                }
                return ((afov) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }
            return ((afov) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((afov) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, arqr] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        ProviderInfo resolveContentProvider;
        ProviderInfo providerInfo;
        int i = this.c;
        int i2 = 0;
        String str = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    aqil.P(obj);
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    this.b.a(mediaMetadataRetriever);
                    try {
                        return ((afva) this.a).a(mediaMetadataRetriever);
                    } finally {
                        mediaMetadataRetriever.release();
                    }
                }
                aqil.P(obj);
                String authority = ((Uri) this.a).getAuthority();
                if (authority != null) {
                    providerInfo = ((Context) ((atsg) this.b).d).getPackageManager().resolveContentProvider(authority, 0);
                } else {
                    providerInfo = null;
                }
                if (providerInfo != null) {
                    str = providerInfo.packageName;
                }
                return Boolean.valueOf(d.F(str, ((Context) ((atsg) this.b).d).getPackageName()));
            }
            aqil.P(obj);
            String authority2 = ((Uri) this.a).getAuthority();
            if (authority2 == null || (resolveContentProvider = ((afiz) this.b).b.getPackageManager().resolveContentProvider(authority2, 0)) == null) {
                return null;
            }
            return resolveContentProvider.packageName;
        }
        aqil.P(obj);
        aron aronVar = new aron((byte[]) null);
        for (Object obj2 : this.b) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                aqjn.G();
            }
            aflx aflxVar = (aflx) obj2;
            afox afoxVar = (afox) this.a;
            String string = afoxVar.o.getString(afnw.a(aflxVar).a);
            string.getClass();
            aronVar.add(new afos(string, i3));
            afoxVar.p.put(i3, aronVar.c - 1);
            Iterator it = aflxVar.b.iterator();
            while (it.hasNext()) {
                aronVar.add(new afor((afnb) it.next(), i3));
            }
            i2 = i3;
        }
        return aqjn.x(aronVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, arqr] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return new afov((arqr) this.b, (afva) this.a, arpeVar, 3);
                }
                return new afov((Uri) this.a, (atsg) this.b, arpeVar, 2);
            }
            return new afov((Uri) this.a, (afiz) this.b, arpeVar, 1);
        }
        return new afov((afox) this.a, (List) this.b, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afov(Uri uri, afiz afizVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = uri;
        this.b = afizVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afov(Uri uri, atsg atsgVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = uri;
        this.b = atsgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afov(arqr arqrVar, afva afvaVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = arqrVar;
        this.a = afvaVar;
    }
}
