package com.google.android.ims.rcsservice.businessinfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: com.google.android.ims.rcsservice.businessinfo.$AutoValue_BusinessInfoProperty, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$AutoValue_BusinessInfoProperty extends BusinessInfoProperty {
    private final String header;
    private final int importance;
    private final int propertyType;
    private final String subHeader;
    private final String value;

    public C$AutoValue_BusinessInfoProperty(int i, String str, String str2, String str3, int i2) {
        this.propertyType = i;
        if (str != null) {
            this.value = str;
            this.header = str2;
            this.subHeader = str3;
            this.importance = i2;
            return;
        }
        throw new NullPointerException("Null value");
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof BusinessInfoProperty) {
            BusinessInfoProperty businessInfoProperty = (BusinessInfoProperty) obj;
            if (this.propertyType == businessInfoProperty.getPropertyType() && this.value.equals(businessInfoProperty.getValue()) && ((str = this.header) != null ? str.equals(businessInfoProperty.getHeader()) : businessInfoProperty.getHeader() == null) && ((str2 = this.subHeader) != null ? str2.equals(businessInfoProperty.getSubHeader()) : businessInfoProperty.getSubHeader() == null) && this.importance == businessInfoProperty.getImportance()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.ims.rcsservice.businessinfo.BusinessInfoProperty
    public String getHeader() {
        return this.header;
    }

    @Override // com.google.android.ims.rcsservice.businessinfo.BusinessInfoProperty
    public int getImportance() {
        return this.importance;
    }

    @Override // com.google.android.ims.rcsservice.businessinfo.BusinessInfoProperty
    public int getPropertyType() {
        return this.propertyType;
    }

    @Override // com.google.android.ims.rcsservice.businessinfo.BusinessInfoProperty
    public String getSubHeader() {
        return this.subHeader;
    }

    @Override // com.google.android.ims.rcsservice.businessinfo.BusinessInfoProperty
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.propertyType ^ 1000003) * 1000003) ^ this.value.hashCode();
        String str = this.header;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = ((hashCode2 * 1000003) ^ hashCode) * 1000003;
        String str2 = this.subHeader;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((i2 ^ i) * 1000003) ^ this.importance;
    }

    public String toString() {
        return "BusinessInfoProperty{propertyType=" + this.propertyType + ", value=" + this.value + ", header=" + this.header + ", subHeader=" + this.subHeader + ", importance=" + this.importance + "}";
    }
}
