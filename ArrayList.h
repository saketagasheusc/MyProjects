
template <class T>
class ArrayList {
    public:
        ArrayList();
        ~ArrayList();

        void push(T value);
        T pop();
        void set(size_t index, T value);
        T get(size_t index);

        size_t size();
        size_t capacity();
        void print();
        int is_empty();

    private:
        size_t m_size;
        size_t m_capacity;
        T* m_data;
        size_t resize();
}
