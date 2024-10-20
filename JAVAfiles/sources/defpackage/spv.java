package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class spv extends aglo {
    public static final String[] a = {"etouffee_rcs_metadata.rcs_message_id", "etouffee_rcs_metadata.preview_etouffee", "etouffee_rcs_metadata.preview_summary", "etouffee_rcs_metadata.preview_version", "etouffee_rcs_metadata.attachment_etouffee", "etouffee_rcs_metadata.attachment_summary", "etouffee_rcs_metadata.attachment_version", "etouffee_rcs_metadata.creation_timestamp", "etouffee_rcs_metadata.attachment_uri", "etouffee_rcs_metadata.custom_delivery_receipt_mime_type", "etouffee_rcs_metadata.custom_delivery_receipt_content", "etouffee_rcs_metadata.file_uploaded_xml_from_content_server", "etouffee_rcs_metadata.file_uploaded_fallback_uri", "etouffee_rcs_metadata.file_uploaded_expiry", "etouffee_rcs_metadata.plaintext_attachment_name", "etouffee_rcs_metadata.plaintext_attachment_content_type", "etouffee_rcs_metadata.plaintext_thumbnail_content_type"};
    public static final spo b;
    public static final int[] c;

    static {
        alok alokVar = new alok();
        alokVar.h("etouffee_rcs_metadata.attachment_uri", 35060);
        alokVar.h("etouffee_rcs_metadata.custom_delivery_receipt_mime_type", 37020);
        alokVar.h("etouffee_rcs_metadata.custom_delivery_receipt_content", 37020);
        alokVar.h("etouffee_rcs_metadata.file_uploaded_xml_from_content_server", 48010);
        alokVar.h("etouffee_rcs_metadata.file_uploaded_fallback_uri", 48010);
        alokVar.h("etouffee_rcs_metadata.file_uploaded_expiry", 48010);
        alokVar.h("etouffee_rcs_metadata.plaintext_attachment_name", 56020);
        alokVar.h("etouffee_rcs_metadata.plaintext_attachment_content_type", 56020);
        alokVar.h("etouffee_rcs_metadata.plaintext_thumbnail_content_type", 56020);
        alokVar.b();
        new alok().b();
        b = new spo();
        c = new int[]{35050, 35060, 37020, 48010, 56020};
    }

    public static spn a() {
        int i = spk.a;
        return new spn();
    }

    public static final spt b() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("etouffee_rcs_metadata.rcs_message_id");
            alobVar.h("etouffee_rcs_metadata.preview_etouffee");
            alobVar.h("etouffee_rcs_metadata.preview_summary");
            alobVar.h("etouffee_rcs_metadata.preview_version");
            alobVar.h("etouffee_rcs_metadata.attachment_etouffee");
            alobVar.h("etouffee_rcs_metadata.attachment_summary");
            alobVar.h("etouffee_rcs_metadata.attachment_version");
            alobVar.h("etouffee_rcs_metadata.creation_timestamp");
            if (valueOf.intValue() >= 35060) {
                alobVar.h("etouffee_rcs_metadata.attachment_uri");
            }
            if (valueOf.intValue() >= 37020) {
                alobVar.h("etouffee_rcs_metadata.custom_delivery_receipt_mime_type");
            }
            if (valueOf.intValue() >= 37020) {
                alobVar.h("etouffee_rcs_metadata.custom_delivery_receipt_content");
            }
            if (valueOf.intValue() >= 48010) {
                alobVar.h("etouffee_rcs_metadata.file_uploaded_xml_from_content_server");
            }
            if (valueOf.intValue() >= 48010) {
                alobVar.h("etouffee_rcs_metadata.file_uploaded_fallback_uri");
            }
            if (valueOf.intValue() >= 48010) {
                alobVar.h("etouffee_rcs_metadata.file_uploaded_expiry");
            }
            if (valueOf.intValue() >= 56020) {
                alobVar.h("etouffee_rcs_metadata.plaintext_attachment_name");
            }
            if (valueOf.intValue() >= 56020) {
                alobVar.h("etouffee_rcs_metadata.plaintext_attachment_content_type");
            }
            if (valueOf.intValue() >= 56020) {
                alobVar.h("etouffee_rcs_metadata.plaintext_thumbnail_content_type");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new spt(strArr);
    }

    public static void c(agnw agnwVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_message_id TEXT PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("preview_etouffee BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("preview_summary BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("preview_version INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("attachment_etouffee BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("attachment_summary BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("attachment_version INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("creation_timestamp INT DEFAULT(0)");
        if (i >= 35060) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("attachment_uri TEXT");
        }
        if (i >= 37020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("custom_delivery_receipt_mime_type TEXT");
        }
        if (i >= 37020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("custom_delivery_receipt_content BLOB");
        }
        if (i >= 48010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("file_uploaded_xml_from_content_server BLOB");
        }
        if (i >= 48010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("file_uploaded_fallback_uri TEXT");
        }
        if (i >= 48010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("file_uploaded_expiry INT");
        }
        if (i >= 56020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("plaintext_attachment_name TEXT");
        }
        if (i >= 56020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("plaintext_attachment_content_type TEXT");
        }
        if (i >= 56020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("plaintext_thumbnail_content_type TEXT");
        }
        sb.insert(0, "CREATE TABLE etouffee_rcs_metadata (");
        sb.append(");");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
