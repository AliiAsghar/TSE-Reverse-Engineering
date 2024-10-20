package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.ArrayList;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class yaa implements Supplier {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public /* synthetic */ yaa(int i) {
        this.b = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        agmh agmhVar;
        agmh agmhVar2;
        switch (this.b) {
            case 0:
                return new ArrayList();
            case 1:
                return ruy.a;
            case 2:
                return new apba("Invalid proto data");
            case 3:
                return new ArrayList();
            case 4:
                return new ArrayList();
            case 5:
                return amnl.a.createBuilder();
            case 6:
                return yhf.a("video/avc");
            case 7:
                return yhf.a("audio/mp4a-latm");
            case 8:
                return (amzb) amzc.a.createBuilder();
            case 9:
                throw null;
            case 10:
                throw null;
            case 11:
                return new ynt();
            case 12:
                return new ynt();
            case 13:
                agmhVar = MessagesTable.c.a;
                return agmhVar;
            case 14:
                agmhVar2 = sni.c.a;
                return agmhVar2;
            case 15:
                return (amyv) amyw.a.createBuilder();
            case 16:
                return (amgl) amgu.a.createBuilder();
            case 17:
                return new ArrayList();
            case 18:
                return new IllegalArgumentException("RCS identifier not present");
            case 19:
                return yxr.d();
            default:
                return yxr.d();
        }
    }
}
