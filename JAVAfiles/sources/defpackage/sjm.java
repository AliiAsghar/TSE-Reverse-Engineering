package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sjm extends aglo {
    public static final String[] a = {"contacts.cp2_id", "contacts.contact_id", "contacts.lookup_key", "contacts.phone_number", "contacts.display_name", "contacts.given_name", "contacts.family_name", "contacts.photo", "contacts.thumbnail", "contacts.birthday", "contacts.anniversary", "contacts.last_updated_timestamp", "contacts.sort_key", "contacts.phonebook_label", "contacts.phonebook_bucket", "contacts.contact_type", "contacts.type_label", "contacts.display_destination"};
    public static final alor b;
    public static final int[] c;
    public static final int[] d;
    public static final tby e;

    static {
        alok alokVar = new alok();
        alokVar.h("contacts.sort_key", 59070);
        alokVar.h("contacts.phonebook_label", 59070);
        alokVar.h("contacts.phonebook_bucket", 59070);
        alokVar.h("contacts.contact_type", 59080);
        alokVar.h("contacts.type_label", 60150);
        alokVar.h("contacts.display_destination", 59120);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("cp2_id", "index_contacts_cp2_id");
        alokVar2.h("contact_id", "index_contacts_contact_id");
        alokVar2.h("lookup_key", "index_contacts_lookup_key");
        alokVar2.h("phone_number", "index_contacts_phone_number");
        alokVar2.h("phonebook_label", "index_contacts_phonebook_label");
        alokVar2.b();
        e = new tby((byte[]) null);
        c = new int[]{58630, 60150};
        d = new int[]{59070, 59080, 59120};
    }

    public static final sjk a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("contacts.cp2_id");
            alobVar.h("contacts.contact_id");
            alobVar.h("contacts.lookup_key");
            alobVar.h("contacts.phone_number");
            alobVar.h("contacts.display_name");
            alobVar.h("contacts.given_name");
            alobVar.h("contacts.family_name");
            alobVar.h("contacts.photo");
            alobVar.h("contacts.thumbnail");
            alobVar.h("contacts.birthday");
            alobVar.h("contacts.anniversary");
            alobVar.h("contacts.last_updated_timestamp");
            if (valueOf.intValue() >= 59070) {
                alobVar.h("contacts.sort_key");
            }
            if (valueOf.intValue() >= 59070) {
                alobVar.h("contacts.phonebook_label");
            }
            if (valueOf.intValue() >= 59070) {
                alobVar.h("contacts.phonebook_bucket");
            }
            if (valueOf.intValue() >= 59080) {
                alobVar.h("contacts.contact_type");
            }
            if (valueOf.intValue() >= 60150) {
                alobVar.h("contacts.type_label");
            }
            if (valueOf.intValue() >= 59120) {
                alobVar.h("contacts.display_destination");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new sjk(strArr);
    }

    public static String b(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cp2_id INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("contact_id INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("lookup_key TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("phone_number TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("display_name TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("given_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("family_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("photo TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("thumbnail TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("birthday TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("anniversary TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_updated_timestamp INTEGER NOT NULL");
        if (i >= 59070) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("sort_key TEXT NOT NULL");
        }
        if (i >= 59070) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("phonebook_label TEXT NOT NULL");
        }
        if (i >= 59070) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("phonebook_bucket INTEGER");
        }
        if (i >= 59080) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("contact_type INTEGER");
        }
        if (i >= 60150) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("type_label TEXT");
        }
        if (i >= 59120) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("display_destination TEXT NOT NULL");
        }
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void c(agnw agnwVar, int i) {
        agnwVar.z(b(i, "contacts"));
        for (String str : e(i)) {
            agnwVar.z(str);
        }
    }

    public static void d(agnw agnwVar, int i) {
        agnc.F(agnwVar, "contacts", b(i, "TEMP___contacts"), a, e(i));
    }

    static String[] e(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_contacts_cp2_id");
        arrayList.add("CREATE UNIQUE INDEX index_contacts_cp2_id ON contacts(cp2_id);");
        arrayList.add("DROP INDEX IF EXISTS index_contacts_contact_id");
        arrayList.add("CREATE INDEX index_contacts_contact_id ON contacts(contact_id);");
        arrayList.add("DROP INDEX IF EXISTS index_contacts_lookup_key");
        arrayList.add("CREATE INDEX index_contacts_lookup_key ON contacts(lookup_key);");
        arrayList.add("DROP INDEX IF EXISTS index_contacts_phone_number");
        arrayList.add("CREATE INDEX index_contacts_phone_number ON contacts(phone_number);");
        if (i >= 59070) {
            arrayList.add("DROP INDEX IF EXISTS contacts_sort");
            arrayList.add("CREATE INDEX contacts_sort ON contacts(phonebook_bucket, sort_key);");
        }
        if (i >= 59080) {
            arrayList.add("DROP INDEX IF EXISTS index_contacts_phonebook_label");
            arrayList.add("CREATE INDEX index_contacts_phonebook_label ON contacts(phonebook_label);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
