package kotlin_tasks

enum class ParcelStatus(val value: Int) {
    SHIPPED(100),
    READY_TO_SHIP(200),
    RECEIVED(300),
    UNKNOWN(-1);

    companion object {

    }
}
