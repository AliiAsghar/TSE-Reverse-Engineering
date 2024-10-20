package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.stream.Collectors;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tbj implements alhr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ tbj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "_id:".concat(String.valueOf(((tbn) this.a).getString(0)));
            case 1:
                taz e = ParticipantsTable.e();
                e.w("updateAndReturnUpdatedRowsAfterUpdate-pre-participants");
                e.s();
                e.n(new agpk("ROWID", new Object[0]), "_rowid");
                Object obj = this.a;
                tba tbaVar = (tba) obj;
                alog alogVar = tbaVar.e;
                int i = ((alsx) alogVar).c;
                for (int i2 = 0; i2 < i; i2++) {
                    e.k((tbc) ((agpw) alogVar.get(i2)));
                }
                if (tbaVar.d.b) {
                    tbd tbdVar = new tbd();
                    tbdVar.W(((agpr) obj).f());
                    e.f(tbdVar);
                }
                alob alobVar = new alob();
                tav tavVar = (tav) e.b().n();
                while (tavVar.moveToNext()) {
                    try {
                        alobVar.h(tavVar.cX("_rowid"));
                    } catch (Throwable th) {
                        try {
                            tavVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                tavVar.close();
                String str = (String) Collection.EL.stream(alobVar.g()).collect(Collectors.joining(","));
                ((agpr) obj).e();
                taz e2 = ParticipantsTable.e();
                e2.w("updateAndReturnUpdatedRowsAfterUpdate-post-participants");
                tbd tbdVar2 = new tbd();
                tbdVar2.W(new agpk("ROWID IN ($R)", new Object[]{str}));
                e2.f(tbdVar2);
                return ((tav) e2.b().n()).cR();
            case 2:
                return "latitude:".concat(String.valueOf(((tbn) this.a).getString(19)));
            case 3:
                return "message_id:".concat(String.valueOf(((tbn) this.a).getString(1)));
            case 4:
                return "preview_content_uri:".concat(String.valueOf(((tbn) this.a).getString(20)));
            case 5:
                return "preview_content_type:".concat(String.valueOf(((tbn) this.a).getString(21)));
            case 6:
                return "fallback_uri:".concat(String.valueOf(((tbn) this.a).getString(22)));
            case 7:
                return "source:".concat(String.valueOf(((tbn) this.a).getString(23)));
            case 8:
                return "bundle_index:".concat(String.valueOf(((tbn) this.a).getString(24)));
            case 9:
                return "blob_id:".concat(String.valueOf(((tbn) this.a).getString(25)));
            case 10:
                return "blob_gaia_email:".concat(String.valueOf(((tbn) this.a).getString(26)));
            case 11:
                return "cms_full_size_blob_id:".concat(String.valueOf(((tbn) this.a).getString(27)));
            case 12:
                return "output_uri:".concat(String.valueOf(((tbn) this.a).getString(10)));
            case 13:
                return "cms_media_encryption_key:".concat(String.valueOf(((tbn) this.a).getString(28)));
            case 14:
                return "cms_compressed_media_encryption_key:".concat(String.valueOf(((tbn) this.a).getString(29)));
            case 15:
                return "text:".concat(String.valueOf(((tbn) this.a).getString(2)));
            case 16:
                return "blob_upload_permanent_failure:".concat(String.valueOf(((tbn) this.a).getString(30)));
            case 17:
                return "blob_upload_timestamp:".concat(String.valueOf(((tbn) this.a).getString(31)));
            case 18:
                return "expressive_sticker_name:".concat(String.valueOf(((tbn) this.a).getString(32)));
            case 19:
                return "file_name:".concat(String.valueOf(((tbn) this.a).getString(33)));
            default:
                return "duration:".concat(String.valueOf(((tbn) this.a).getString(34)));
        }
    }
}
