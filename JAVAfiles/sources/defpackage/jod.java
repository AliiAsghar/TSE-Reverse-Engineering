package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class jod extends arrm implements arqr {
    public jod(Object obj) {
        super(1, obj, joe.class, "onReceiveContent", "onReceiveContent(Landroidx/core/view/ContentInfoCompat;)Landroidx/core/view/ContentInfoCompat;", 0);
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        afsx afsxVar;
        int i;
        ecv ecvVar = (ecv) obj;
        ecvVar.getClass();
        joe joeVar = (joe) this.e;
        alvi alviVar = joe.a;
        alvw g = joe.a.g();
        g.X(alwp.a, "BugleComposeRow2");
        ((alvg) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/input/AttachmentInsertionListener", "onReceiveContent", 45, "AttachmentInsertionListener.kt")).t("onReceiveContent %s", ecvVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int itemCount = ecvVar.d().getItemCount();
        for (int i2 = 0; i2 < itemCount; i2++) {
            ClipData.Item itemAt = ecvVar.d().getItemAt(i2);
            Uri uri = itemAt.getUri();
            if (uri == null) {
                alvw g2 = joe.a.g();
                g2.X(alwp.a, "BugleComposeRow2");
                ((alvg) g2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/input/AttachmentInsertionListener", "onReceiveContent", 51, "AttachmentInsertionListener.kt")).t("Skipping received content with null uri: %s", itemAt);
            } else {
                ClipData d = ecvVar.d();
                d.getClass();
                int mimeTypeCount = d.getDescription().getMimeTypeCount();
                if (mimeTypeCount == 1) {
                    String mimeType = d.getDescription().getMimeType(0);
                    mimeType.getClass();
                    afsxVar = afwv.H(mimeType);
                } else if (mimeTypeCount == d.getItemCount()) {
                    String mimeType2 = d.getDescription().getMimeType(i2);
                    mimeType2.getClass();
                    afsxVar = afwv.H(mimeType2);
                } else {
                    afsxVar = null;
                }
                if (afsxVar == null || d.F(afsxVar.c, "*")) {
                    afsxVar = null;
                }
                if (afsxVar == null) {
                    alvw i3 = joe.a.i();
                    i3.X(alwp.a, "BugleComposeRow2");
                    ((alvg) i3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/input/AttachmentInsertionListener", "resolveMediaType", 88, "AttachmentInsertionListener.kt")).t("Getting type from content resolver for %s", uri);
                    String type = joeVar.d.getContentResolver().getType(uri);
                    if (type == null) {
                        alvw i4 = joe.a.i();
                        i4.X(alwp.a, "BugleComposeRow2");
                        ((alvg) i4.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/input/AttachmentInsertionListener", "resolveMediaType", 91, "AttachmentInsertionListener.kt")).t("Unable to resolve type for %s", uri);
                        afsxVar = null;
                    } else {
                        alvw d2 = joe.a.d();
                        d2.X(alwp.a, "BugleComposeRow2");
                        ((alvg) d2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/input/AttachmentInsertionListener", "resolveMediaType", 94, "AttachmentInsertionListener.kt")).D("Resolved type %s for %s", type, uri);
                        afsxVar = afwv.H(type);
                    }
                }
                if (afsxVar != null) {
                    Set n = hld.n();
                    if (!(n instanceof Collection) || !n.isEmpty()) {
                        Iterator it = n.iterator();
                        while (it.hasNext()) {
                            if (ClipDescription.compareMimeTypes(afsxVar.a(), (String) it.next())) {
                                alvw d3 = joe.a.d();
                                d3.X(alwp.a, "BugleComposeRow2");
                                ((alvg) d3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/input/AttachmentInsertionListener", "onReceiveContent", 59, "AttachmentInsertionListener.kt")).D("Accepting received content with MediaType %s: %s", afsxVar, itemAt);
                                int b = ecvVar.b();
                                if (b != 1) {
                                    if (b != 2) {
                                        if (b != 3) {
                                            alvw i5 = joe.a.i();
                                            i5.X(alwp.a, "BugleComposeRow2");
                                            ((alvg) i5.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/input/AttachmentInsertionListener", "getSource", 109, "AttachmentInsertionListener.kt")).w("Using EntryPoint.UNKNOWN for %d used by %s", b, uri);
                                            i = 1;
                                        } else {
                                            i = 5;
                                        }
                                    } else {
                                        i = 3;
                                    }
                                } else {
                                    i = 4;
                                }
                                afcm afcmVar = new afcm(uri.getAuthority(), i);
                                itemAt.getClass();
                                linkedHashSet.add(itemAt);
                                qjh.l(joeVar.e, null, new jli(joeVar, new jgw(afsxVar, uri, null, afcmVar), (arpe) null, 5), 3);
                            }
                        }
                    }
                }
                alvw g3 = joe.a.g();
                g3.X(alwp.a, "BugleComposeRow2");
                ((alvg) g3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/input/AttachmentInsertionListener", "onReceiveContent", 56, "AttachmentInsertionListener.kt")).D("Skipping received content with MediaType %s: %s", afsxVar, itemAt);
            }
        }
        return (ecv) ecvVar.e(new joc(linkedHashSet, 0)).first;
    }
}
