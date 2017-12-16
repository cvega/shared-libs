
def setName(value) {
    name = value
}
def getName() {
    name
}
def bye() {
    echo "bye, ${name}!"
}
def caution(message) {
    echo "Hello, ${name}! CAUTION: ${message}"
}
