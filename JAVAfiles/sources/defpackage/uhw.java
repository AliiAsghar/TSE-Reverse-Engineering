package defpackage;

import android.os.Bundle;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uhw implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ uhw(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        Bundle bundle;
        String str;
        String str2;
        int i = 5;
        int i2 = 6;
        int i3 = 4;
        switch (this.a) {
            case 0:
                Bundle bundle2 = new Bundle();
                int i4 = ((uhu) obj).a;
                int i5 = i4 - 1;
                if (i4 != 0) {
                    bundle2.putInt("result_error_key", i5);
                    return bundle2;
                }
                throw null;
            case 1:
                return null;
            case 2:
                alvw i6 = uil.a.i();
                i6.X(alwp.a, "BugleResizing");
                ((alvg) ((alvg) ((alvg) i6).g((Exception) obj)).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingHandler", "processPendingWorkItemAsync", 87, "ResizingHandler.java")).q("ResizingHandler failed.");
                return upm.d();
            case 3:
                upm upmVar = (upm) obj;
                if (upmVar.a && (bundle = upmVar.e) != null) {
                    char[] charArray = bundle.getCharArray("output_uri");
                    char[] charArray2 = bundle.getCharArray("content_type");
                    aozy createBuilder = uiq.a.createBuilder();
                    if (charArray != null) {
                        str = String.valueOf(charArray);
                    } else {
                        str = "";
                    }
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    uiq uiqVar = (uiq) createBuilder.b;
                    str.getClass();
                    uiqVar.d = str;
                    int i7 = bundle.getInt("status");
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 != 4) {
                                    i = 2;
                                } else {
                                    i = 6;
                                }
                            }
                        } else {
                            i = 4;
                        }
                    } else {
                        i = 3;
                    }
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((uiq) createBuilder.b).c = a.ao(i);
                    if (charArray2 != null) {
                        str2 = String.valueOf(charArray2);
                    } else {
                        str2 = "*/*";
                    }
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    uiq uiqVar2 = (uiq) createBuilder.b;
                    str2.getClass();
                    uiqVar2.e = str2;
                    return (uiq) createBuilder.s();
                }
                aozy createBuilder2 = uiq.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ((uiq) createBuilder2.b).c = a.ao(4);
                return (uiq) createBuilder2.s();
            case 4:
                return new gsw();
            case 5:
                anma anmaVar = (anma) obj;
                if (anmaVar == null) {
                    ukd.a.q("GetPublicKeysResponse for vsms sender was null");
                    return new gsw();
                }
                if (anmaVar.b.isEmpty()) {
                    ukd.a.q("No public keys returned for vsms sender");
                    return new gsw();
                }
                xyo c = ukd.a.c();
                c.H("Brand keys successfully retrieved");
                c.x("key count", anmaVar.b.size());
                c.q();
                hgi hgiVar = new hgi((char[]) null);
                ArrayList arrayList = new ArrayList();
                for (int i8 = 0; i8 < anmaVar.b.size(); i8++) {
                    String bV = a.bV(i8, "vsms_brand_public_key_");
                    arrayList.add(bV);
                    hgiVar.m(bV, ((aozb) anmaVar.b.get(i8)).H());
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                strArr.getClass();
                hgiVar.n("vsms_brand_public_keys_name_list", strArr);
                return new gsw(hgiVar.j());
            case 6:
                return upm.b();
            case 7:
                alwo alwoVar = una.a;
                return null;
            case 8:
                alwo alwoVar2 = una.a;
                return null;
            case 9:
                return (Void) obj;
            case 10:
                upy a = uqb.a();
                a.w("getUnscheduledItemsQuery");
                a.d(new uol((Collection) obj, i2));
                a.e(new atkn(uqb.c.a, (byte[]) null));
                return (upv) a.b().n();
            case 11:
                uuz.a.r("Got IllegalArgumentException when refreshing phone registration", (IllegalArgumentException) obj);
                return null;
            case 12:
                uve.a.r("Got StatusRuntimeException during refresh", (aqwb) obj);
                return null;
            case 13:
                Stream filter = Collection.EL.stream((List) obj).filter(new trt(20));
                int i9 = alog.d;
                return (List) Collection.EL.stream((alog) filter.collect(alls.a)).map(new uvo(i3)).flatMap(new uvo(i)).collect(alls.a);
            case 14:
                return true;
            case 15:
                return true;
            case 16:
                uws b = uws.b(((uwt) obj).h);
                if (b == null) {
                    return uws.GSOS_UNKNOWN;
                }
                return b;
            case 17:
                return Long.valueOf(((uwt) obj).c);
            case 18:
                return Boolean.valueOf(((uwt) obj).g);
            case 19:
                akfc akfcVar = uwu.a;
                aozy builder = ((uwt) obj).toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                uwt uwtVar = (uwt) builder.b;
                uwtVar.b |= 16;
                uwtVar.e = false;
                return (uwt) builder.s();
            default:
                return Boolean.valueOf(((uwt) obj).d);
        }
    }
}
